package com.techietipps.ordermgmt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("orderController")
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/")
    public String healthCheck(){
        return "all good";
    }
}
