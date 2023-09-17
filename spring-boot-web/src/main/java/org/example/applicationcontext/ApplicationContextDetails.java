package org.example.applicationcontext;

import jakarta.annotation.PostConstruct;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ApplicationContextDetails {

    private final ApplicationContext applicationContext;

    public ApplicationContextDetails(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void init() {
        this.printApplicationContextDetails();
    }

    public void printApplicationContextDetails() {

        System.out.printf("%n%n%n----- bean definitions -----%n%n%n");

        Arrays.stream(applicationContext.getBeanDefinitionNames()).sorted().forEach(
                beanName -> {
                    System.out.printf("---- bean name    = %s%n", beanName);

                    String[] aliases = applicationContext.getAliases(beanName);
                    System.out.printf("---- bean aliases = %s%n", Arrays.asList(aliases));

                    System.out.printf("---- is singleton = %s%n", applicationContext.isSingleton(beanName));

                    System.out.printf("%n");
                });
    }
}
