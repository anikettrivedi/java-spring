package com.example.springcore.aspectj;

import com.example.springcore.aspectj.service.ServiceJoinPointsDef;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectJDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.example.springcore.aspectj"
        );


        JoinPointsDef pointcutsAndJoinPointsDef = context.getBean(JoinPointsDef.class);
        pointcutsAndJoinPointsDef.helloWorld();

        ServiceJoinPointsDef serviceJoinPointsDef = context.getBean(ServiceJoinPointsDef.class);
        serviceJoinPointsDef.serviceNo1();
        serviceJoinPointsDef.serviceNo2();


    }

}
