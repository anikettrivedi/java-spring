package com.example.springcore.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class AdvicesAndPointcuts {

    // inline point cut expression followed by advice
    @Before("execution(public * com.example.springcore.aspectj.SomeMethods.helloWorld())")
    private void beforeExecutionOfHelloWorld() {
        System.out.printf("%s helloWorld -> before execution advice!%n", AdvicesAndPointcuts.class.getName());
    }

    // inline point cut expression followed by advice
    @After("execution(public * com.example.springcore.aspectj.SomeMethods.helloWorld())")
    private void afterExecutionOfHelloWorld() {
        System.out.printf("%s helloWorld -> after execution advice!%n", AdvicesAndPointcuts.class.getName());
    }

    // inline point cut expression followed by advice
    @Before("within(com.example.springcore.aspectj.service..*)")
    private void beforeServiceLayerMethodExecutions() {
        System.out.printf("%s com.example.springcore.aspectj.service package methods -> before execution advice!%n", AdvicesAndPointcuts.class.getName());
    }

    // inline point cut expression followed by advice
    @AfterReturning(
            pointcut = "execution(* com.example.springcore.aspectj.SomeMethods.getSomeString(..))",
            returning = "returnValue"
    )
    private void printReturnedValue(Object returnValue) {
        System.out.printf("value returned = %s%n", returnValue.toString());
    }

    @AfterThrowing(
            pointcut = "execution(* com.example.springcore.aspectj.SomeMethods.throwRuntimeException(..))",
            throwing = "ex"
    )
    private void printThrownException(RuntimeException ex){
        System.out.printf("Exception thrown = %s", ex.getMessage());
    }

    @Around("execution(* com.example.springcore.aspectj.SomeMethods.sleepForNSeconds(..))")
    private Object calculateMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object returnValue = pjp.proceed();
        stopWatch.stop();

        System.out.printf("Return value = %s%n", returnValue);
        System.out.printf("Stopwatch ran for %s seconds!%n", stopWatch.getTotalTimeSeconds());

        return returnValue;
    }


}
