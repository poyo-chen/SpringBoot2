package com.martin.boot.config;

import ch.qos.logback.classic.db.DBHelper;
import com.martin.boot.bean.Pet;
import com.martin.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
 * 1.配置類中使用@Bean在方法上給容器註冊組件，默認是單體實例
 * 2.配置類本身也是組件
 * 3.proxyBeanMethods:代理bean方法
 *   Full(proxyBeanMethods=true)每次調用都是單體實例
 *   Lite(proxyBeanMethods=false)每次被調用都是重新創建
 *   組件依賴必須使用Full模式默認
 *
 * 4.@Import({User.class,DBAppend.class})
 *   給容器中自動創建出這兩個類型的組件
 * */

@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false) //等同於配置文件
@ConditionalOnBean(name="john")
//@EnableConfigurationProperties(Car.class)
public class MyConfig {


    @Bean
    public User user01() {
        return new User("pig", 18);
    }

    @Bean("tom")
    public Pet tomPet() {
        return new Pet("piggy");
    }

    @Bean("tom22")
    public Pet tomPet22() {
        return new Pet("piggy");
    }
}
