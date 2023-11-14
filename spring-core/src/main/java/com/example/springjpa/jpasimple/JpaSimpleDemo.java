package com.example.springjpa.jpasimple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JpaSimpleDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springjpa.jpasimple");

        CountryRepository repository = context.getBean(CountryRepository.class);

        System.out.println("\n\n----------- simple read/delete/add operations -------------");

        System.out.println("\n\n----------- list all countries");
        repository.findAll().forEach(System.out::println);

        System.out.println("\n\n----------- deleting country with id=5");
        repository.deleteById(5);
        repository.findAll().forEach(System.out::println);

        System.out.println("\n\n----------- adding new country with id=6");
        repository.save(new Country(6, "India"));
        repository.findAll().forEach(System.out::println);
    }

}
