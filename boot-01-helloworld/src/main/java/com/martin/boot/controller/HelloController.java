package com.martin.boot.controller;

import com.martin.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/Hello")
    public String handle01() {
        return "Hello, Spring Boot 2 !"+"你好";
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
