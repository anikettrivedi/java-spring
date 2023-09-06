package com.example.springcore.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvicesAndPointcuts {

    // explicitly declaring a pointcut to catch declaration of methods matching pattern:
    // public * com.example.springcore.aspectj.JoinPointsDef.helloWorld()
    @Pointcut("execution(public * com.example.springcore.aspectj.JoinPointsDef.helloWorld())")
    public void publicMethod() {}

    // advices around above pointcut
    @Before("execution(public * com.example.springcore.aspectj.JoinPointsDef.helloWorld())")
    private void beforeExecutionOfHelloWorld() {
        System.out.printf("%n%n%s helloWorld -> before execution advice!%n", AdvicesAndPointcuts.class.getName());
    }

    @After("execution(public * com.example.springcore.aspectj.JoinPointsDef.helloWorld())")
    private void afterExecutionOfHelloWorld() {
        System.out.printf("%s helloWorld -> after execution advice!%n", AdvicesAndPointcuts.class.getName());
    }

    // explicitly declaring a pointcut to catch declaration of methods in packages matching pattern:
    // com.example.springcore.aspectj.service..*
    @Pointcut("within(com.example.springcore.aspectj.service..*)")
    public void serviceLayerPointCuts() {}

    // advices around above pointcut
    @Before("within(com.example.springcore.aspectj.service..*)")
    private void beforeServiceLayerMethodExecutions() {
        System.out.printf("%n%n%s com.example.springcore.aspectj.service package methods -> before execution advice!%n", AdvicesAndPointcuts.class.getName());
    }


}
