package com.example.AllAnnotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoadingBean {

    public LazyLoadingBean() {

        System.out.println("lazy loading bean object created ");
    }
}
