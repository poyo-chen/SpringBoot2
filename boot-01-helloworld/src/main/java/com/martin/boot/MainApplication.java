package com.martin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/*
 * 主程序類
 * @SpringBootApplication:這是一個SpringBoot應用
 * */
//@SpringBootApplication(scanBasePackages = "com.martin")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.martin")
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names
        ) {
            System.out.println(name);
        }

//        MyConfig myConfig = run.getBean(MyConfig.class);
//        System.out.println(myConfig);
//
//        //如果@Configuration(proxyBeanMethod = true) SpringBoot總會檢查這個組件是否創建，保持組件單體實例
//        User user1 = myConfig.user01();
//        User user2 = myConfig.user01();
//        System.out.println(user1 == user2);
//
//        User user3 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//        System.out.println("用戶的寵物" + (user3.getPet() == tom));
//
//        //獲取組件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType
//        ) {
//            System.out.println(s);
//        }
//
//        DBHelper dbHelper = run.getBean(DBHelper.class);
//        System.out.println(dbHelper);


        boolean john = run.containsBean("John");
        System.out.println(john);

        boolean user01 = run.containsBean("user01");
        System.out.println(user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println(user01);
    }
}
