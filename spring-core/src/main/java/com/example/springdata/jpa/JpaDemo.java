package com.example.springdata.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class JpaDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springdata.jpa");

        CountryRepository repository = context.getBean(CountryRepository.class);

        System.out.println("\n\n----------- simple read/delete/add operations -------------");

        System.out.println("\n\n----------- list all countries");
        repository.findAll().forEach(System.out::println);

        System.out.println("\n\n----------- deleting country with id=5");
        repository.deleteById(5);
        repository.findAll().forEach(System.out::println);

        System.out.println("\n\n----------- adding new country with id=6");
        repository.save(new CountryPojo(6, "India"));
        repository.findAll().forEach(System.out::println);

        // todo - transactions
        System.out.println("\n\n----------- transactions -------------");

        TransactionService transactionService = context.getBean(TransactionService.class);

        System.out.println("\n\n----------- trying a delete operation in readonly annotated transaction");
        try {
            transactionService.testTransactionRollback(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        repository.findAll().forEach(System.out::println);

    }

}
