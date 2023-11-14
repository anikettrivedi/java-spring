package com.example.springjpa.jpaonetomany;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Collections;

public class JpaDemoOneToMany {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springjpa.jpaonetomany");

        System.out.printf("%n%n******** Simple Select Query ********%n%n");
        CartJpaRepository cartJpaRepository = context.getBean(CartJpaRepository.class);
        cartJpaRepository.findAll().forEach(cart -> {
            System.out.printf("cart id      = %s%n", cart.getId());
            System.out.printf("cart name    = %s%n", cart.getName());
            System.out.printf("cart total   = %s%n", cart.getTotal());
            System.out.printf("cart items   = %s%n", cart.getItems());
        });

        System.out.printf("%n%n******** Hibernate Session get cart by id ********%n%n");
        SessionFactory sessionFactory = context.getBean(LocalSessionFactoryBean.class).getObject();
        try (
                Session session = sessionFactory.openSession();
        ) {
            Cart cart = session.get(Cart.class, 1);
            System.out.printf("cart = %s%n", cart);
        }

        System.out.printf("%n%n******** Hibernate Session insert new cart ********%n%n");
        try (
                Session session = sessionFactory.openSession();
        ) {
            Transaction tx = session.beginTransaction();

            Cart cart = new Cart();
            cart.setId(2);
            cart.setName("cart-2");
            cart.setTotal(0.0D);
            cart.setItems(Collections.emptySet());

            System.out.printf("Inserting cart = %s%n", cart);
            session.persist(cart);

            tx.commit();
        }

        System.out.printf("%n%n******** Hibernate Session list all ********%n%n");
        try (
                Session session = sessionFactory.openSession();
        ) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Cart> criteria = builder.createQuery(Cart.class);
            criteria.from(Cart.class);
            session.createQuery(criteria).getResultList().forEach(System.out::println);
        }



    }

}
