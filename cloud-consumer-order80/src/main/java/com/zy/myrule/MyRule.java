package com.zy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyao
 * @create 2020/6/1
 */
@Configuration
public class MyRule {

    @Bean
    public IRule randomRule()
    {
        return new RandomRule();//定义为随机
    }
}
