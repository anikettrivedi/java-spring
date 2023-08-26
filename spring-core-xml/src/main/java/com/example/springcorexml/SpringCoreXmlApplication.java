package com.example.springcorexml;

import com.example.springcorexml.service.PetStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreXmlApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "services.xml", "daos.xml"
        );

        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        System.out.printf("%n%n%n%n");

        service.printClassName();
        service.printDependenciesClassNames();

        System.out.printf("%n%n%n%n");
    }

}
