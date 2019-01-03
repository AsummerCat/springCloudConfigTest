package com.linjingc.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class TestController {

    @Value("${test}")
    private String test;
    @Value("${person.no1}")
    private String to1;
    @Value("${person.no2}")
    private String to2;

    @RequestMapping("/from")
    public String from() {
        System.out.println(test);
        System.out.println(to1);
        System.out.println(to2);
        return this.test;
    }

}