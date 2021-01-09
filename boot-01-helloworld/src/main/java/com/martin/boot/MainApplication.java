package com.martin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 主程序類
 * @SpringBootApplication:這是一個SpringBoot應用
 * */
@SpringBootApplication(scanBasePackages = "com.martin")
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names
        ) {
            System.out.println(name);
        }
    }
}
