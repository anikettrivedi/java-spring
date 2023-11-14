package com.example.springjpa.jpaonetomany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JpaDemoOneToMany {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.springjpa.jpaonetomany");

        System.out.printf("%n%n******** Simple Select Query ********%n%n");
        CartJpaRepository cartJpaRepository = applicationContext.getBean(CartJpaRepository.class);
        cartJpaRepository.findAll().forEach(cart -> {
            System.out.printf("cart id      = %s%n", cart.getId());
            System.out.printf("cart name    = %s%n", cart.getName());
            System.out.printf("cart total   = %s%n", cart.getTotal());
            System.out.printf("cart items   = %s%n", cart.getItems());
        });

    }

}
