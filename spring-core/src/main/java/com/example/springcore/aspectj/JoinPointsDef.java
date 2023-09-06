package com.example.springcore.aspectj;

import org.springframework.stereotype.Component;

@Component
public class JoinPointsDef {

    // this is a join point defined by a pointcut
    public void helloWorld(){
        System.out.printf("%s says method helloWorld is being executed %n", JoinPointsDef.class.getName());
    }

}
