package com.crw.springcloud.service.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Object index() {
        this.logger.info("/hello, instanceId:{}, host:{}", eurekaInstanceConfig.getInstanceId(), eurekaInstanceConfig.getHostName(false));
        return "Hello, Spring Cloud!";
    }
}
