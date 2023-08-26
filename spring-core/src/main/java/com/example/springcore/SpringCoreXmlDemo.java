package com.example.springcore;

import com.example.springcore.service.PetStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringCoreXmlDemo {

    public static void main(String[] args) {

        System.out.printf("%n%n------ starting SpringCoreXmlApplication ------%n%n");
        System.out.printf("%n%n------ basic spring IOC beans demo using XML bean definitions (dependency injection) ------%n%n");

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "services.xml", "daos.xml"
        );

        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        service.printClassName();
        service.printDependenciesClassNames();

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
