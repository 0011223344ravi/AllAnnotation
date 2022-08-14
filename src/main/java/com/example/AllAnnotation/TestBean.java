package com.example.AllAnnotation;


import org.springframework.stereotype.Component;


@Component
public class TestBean {

    public void display(){
        System.out.println("test bean class method");
    }
}
