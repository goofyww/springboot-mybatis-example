package com.oecoo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/test")
    public Object test(){
        return "<h1>Hello World</h1>";
    }
}
