package com.example.springcore.aspectj.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceJoinPointsDef {

    public void serviceNo1(){
        System.out.printf("%s says method serviceNo1 is being executed %n", ServiceJoinPointsDef.class.getName());
    }

    public void serviceNo2(){
        System.out.printf("%s says method serviceNo2 is being executed %n", ServiceJoinPointsDef.class.getName());
    }

}

