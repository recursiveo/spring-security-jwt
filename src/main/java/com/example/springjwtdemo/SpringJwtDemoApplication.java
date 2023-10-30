package com.example.springjwtdemo;

import com.example.springjwtdemo.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = RsaKeyProperties.class)
public class SpringJwtDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtDemoApplication.class, args);
    }

}
