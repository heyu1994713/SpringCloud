package com.aiguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZuulProxy
public class Zuul_9527_startSpringcloudApp {
    public static void main(String[] args){
        SpringApplication.run(Zuul_9527_startSpringcloudApp.class,args);
    }
}
