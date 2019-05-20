package com.liyong.demo.custom_environ;

import com.liyong.demo.custom_environ.config.CustomApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomizepropertyverifyApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(CustomizepropertyverifyApplication.class);
        springApplication.setApplicationContextClass(CustomApplicationContext.class);
        springApplication.run(args);
    }
}