package com.example.springwebonservlet.annotationsbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoWebApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.springwebonservlet.annotationsbased");


    }

}
