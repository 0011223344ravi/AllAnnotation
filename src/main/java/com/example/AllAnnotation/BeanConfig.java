package com.example.AllAnnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }
}
