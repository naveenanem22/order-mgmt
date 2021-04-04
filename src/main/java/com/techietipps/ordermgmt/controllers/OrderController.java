package com.techietipps.ordermgmt.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("orderController")
@RequestMapping("/orders")
public class OrderController {

    @Value("${sample}")
    private String sampleProp;

    @GetMapping("/")
    public String healthCheck(){
        return sampleProp;
    }
}
