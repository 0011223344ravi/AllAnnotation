package com.example.AllAnnotation.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ServiceInterfaceImplV2 implements ServiceInterface{
    @Override
    public void disp() {
        System.out.println("v2");
    }
}
