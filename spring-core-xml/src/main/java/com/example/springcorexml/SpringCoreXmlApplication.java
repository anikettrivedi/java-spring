package com.example.springcorexml;

import com.example.springcorexml.service.PetStoreService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringCoreXmlApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "services.xml", "daos.xml"
        );

        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        System.out.printf("%n%n------ starting SpringCoreXmlApplication ------%n%n");
        service.printClassName();
        service.printDependenciesClassNames();

        System.out.printf("%n%n------ bean definition names ------%n%n");
        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.printf("%n%n------ bean details ------%n%n");
        Arrays.asList(context.getBeanDefinitionNames()).forEach(
            beanName -> {
                System.out.printf("%-30s%s%s%n", "beanType", " = ", context.getType(beanName));
                System.out.printf("%-30s%s%s%n", "aliases", " = ", Arrays.stream(context.getAliases(beanName)).toList());
                System.out.printf("%-30s%s%s%n", "isSingleton", " = ", context.isSingleton(beanName));
                System.out.printf("%n");
            }
        );


    }

}
