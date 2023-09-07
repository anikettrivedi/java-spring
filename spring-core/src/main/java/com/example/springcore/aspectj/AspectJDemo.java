package com.example.springcore.aspectj;

import com.example.springcore.aspectj.service.ServiceLayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectJDemo {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.example.springcore.aspectj"
        );


        System.out.println("\n\n--------- example number 01 -------");
        SomeMethods someMethods = context.getBean(SomeMethods.class);
        someMethods.helloWorld();

        System.out.println("\n\n--------- example number 02 -------");
        ServiceLayer serviceLayer = context.getBean(ServiceLayer.class);
        serviceLayer.serviceNo1();
        serviceLayer.serviceNo2();

        System.out.println("\n\n--------- example number 03 -------");
        someMethods.getSomeString();


        System.out.println("\n\n--------- example number 04 -------");
        try {
            someMethods.throwRuntimeException();
        } catch (Exception ignored) {
        }

        System.out.println("\n\n--------- example number 05 -------");
        someMethods.sleepForNSeconds(4);
    }

}
