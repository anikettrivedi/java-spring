package com.example.springcore;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 - https://docs.spring.io/spring-framework/docs/5.2.25.RELEASE/spring-framework-reference/core.html#beans-factory-lifecycle
 - https://docs.spring.io/spring-framework/docs/5.2.25.RELEASE/spring-framework-reference/core.html#beans-factory-shutdown
*/
public class SpringCoreXmlBeanLifecycleDemo {

    public static void main(String[] args) {

        System.out.printf("%n%n------ starting SpringCoreXmlMethodInjectionApplication ------%n%n");
        System.out.printf("%n%n------ method injection demo using XML bean definitions ------%n%n");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lifecycle.xml"
        );
        context.registerShutdownHook();

        ((BeanDefinitionRegistry) context.getBeanFactory()).removeBeanDefinition("lifecycle");

    }

}
