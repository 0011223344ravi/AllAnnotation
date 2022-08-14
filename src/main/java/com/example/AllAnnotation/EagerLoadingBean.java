package com.example.AllAnnotation;

import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBean {

    public EagerLoadingBean() {

        System.out.println("EagerLoadingBean object created");
    }
}
