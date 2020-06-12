package com.zy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyao
 * @create 2020/5/29
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced  //开启负载均衡功能
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
