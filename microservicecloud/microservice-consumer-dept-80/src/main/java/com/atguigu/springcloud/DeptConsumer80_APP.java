package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.myselfrule.MySelfRul;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRul.class)
public class DeptConsumer80_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DeptConsumer80_APP.class, args);

	}

}
