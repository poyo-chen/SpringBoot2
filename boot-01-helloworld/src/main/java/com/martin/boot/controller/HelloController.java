package com.martin.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/Hello")
    public String handle01() {
        return "Hello, Spring Boot 2 !"+"你好";
    }
}
