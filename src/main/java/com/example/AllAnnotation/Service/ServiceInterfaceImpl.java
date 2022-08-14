package com.example.AllAnnotation.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceInterfaceImpl implements ServiceInterface {
    @Override
    public void disp() {
        System.out.println("v1");
    }
}
