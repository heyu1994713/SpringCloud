package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.atguigu.myselfrule.MySelfRul;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"}) 
@ComponentScan("com.atguigu.springcloud") 
public class DeptConsumer80_Feign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DeptConsumer80_Feign.class, args);

	}

}
