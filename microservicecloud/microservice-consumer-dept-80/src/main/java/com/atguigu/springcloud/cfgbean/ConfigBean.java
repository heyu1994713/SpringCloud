package com.atguigu.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 类似于spring的配置文件
 * @author heyuhome
 *
 */
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced   //基于ribbon的负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
