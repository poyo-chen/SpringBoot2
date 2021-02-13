package com.martin.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 * 只有容器中的組件才擁有SpringBoot提供的功能
 * */
@Data
@Component
@ConfigurationProperties(prefix = "mycar")
@AllArgsConstructor  //有參數建構子
@NoArgsConstructor //無參數建構子
public class Car {
    private String brand;
    private Integer price;
}
