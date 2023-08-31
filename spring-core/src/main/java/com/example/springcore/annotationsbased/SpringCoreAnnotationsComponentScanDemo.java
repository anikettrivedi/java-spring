package com.example.springcore.annotationsbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringCoreAnnotationsComponentScanDemo {

    public static void main(String[] args) {

        System.out.printf("%n%n------ starting SpringCoreAnnotationsDemo ------%n%n");
        System.out.printf("%n%n------ basic spring IOC beans demo using annotations bean definitions (dependency injection) ------%n%n");

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springcore.annotationsbased");

        System.out.printf("%n%n------ bean definition names ------%n%n");
        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.printf("%n%n------ bean details ------%n%n");
        Arrays.asList(context.getBeanDefinitionNames()).forEach(
                beanName -> {
                    System.out.printf("%-30s%s%s%n", "beanName", " = ", beanName);
                    System.out.printf("%-30s%s%s%n", "beanType", " = ", context.getType(beanName));
                    System.out.printf("%-30s%s%s%n", "aliases", " = ", Arrays.stream(context.getAliases(beanName)).toList());
                    System.out.printf("%-30s%s%s%n", "isSingleton", " = ", context.isSingleton(beanName));
                    System.out.printf("%n");
                }
        );

    }

}
