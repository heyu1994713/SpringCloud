package com.atguigu.springcloud.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService service;
	
	
	@HystrixCommand(fallbackMethod="processHystrix_Get")
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		 Dept dept=this.service.dept(id);
		 if(dept==null) {
			 throw new RuntimeException("该id"+id+"没有对应信息");
		 }
		return dept;
		
	}
	
	public Dept  processHystrix_Get(@PathVariable("id") Long id)
	{
		return new Dept().setDeptno(id).setDeptname(+id+"该id没有响应信息").setDb_source("no datasouce in mysql");
		
	}
	
	
	
	

}
