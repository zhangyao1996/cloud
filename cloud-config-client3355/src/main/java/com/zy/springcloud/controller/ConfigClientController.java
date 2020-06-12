package com.zy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyao
 * @create 2020/6/7
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configValue;

    @GetMapping("/getConfigInfo")
    public String getConfigValue(){
        return configValue;
    }
}
