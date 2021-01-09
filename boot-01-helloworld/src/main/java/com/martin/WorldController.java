package com.martin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @RequestMapping("/World")
    public String handle01() {
        return "Hello World, Spring Boot 2 !"+"你好";
    }
}
