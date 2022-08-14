package com.example.AllAnnotation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DbConfig {

    @Value("${db.driverClass}")
    private String driverClass;

    @Bean
    @Profile("sit")
    public String dataSourceProps() {
        System.out.println(driverClass +"");
        return "dataSource connection for class "+driverClass;
    }


}
