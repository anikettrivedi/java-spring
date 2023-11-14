package com.example.springdata.jpaonetomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import java.util.HashSet;
import java.util.Set;

// todo
public class JpaDemoOneToMany {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springdata.jpaonetomany");
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = context.getBean(LocalContainerEntityManagerFactoryBean.class);
        EntityManagerFactory entityManagerFactory = (EntityManagerFactory) entityManagerFactoryBean;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        SessionFactory sessionFactory = session.getSessionFactory();
        Transaction tx = null;

        Cart cart = new Cart();
        cart.setName("MyCart1");

        CartItem item1 = new CartItem("I10", 10, 1, cart);
        CartItem item2 = new CartItem("I20", 20, 2, cart);
        Set<CartItem> itemsSet = new HashSet<>();
        itemsSet.add(item1);
        itemsSet.add(item2);

        cart.setItems(itemsSet);
        cart.setTotal(10 * 1 + 20 * 2);

        try {
            //Get Session
            session = sessionFactory.getCurrentSession();
            System.out.println("Session created");
            //start transaction
            tx = session.beginTransaction();

            //Save the Model object
            session.save(cart);
            session.save(item1);
            session.save(item2);

            //Commit transaction
            tx.commit();
            System.out.println("Cart1 ID=" + cart.getId());
            System.out.println("item1 ID=" + item1.getId() + ", Foreign Key Cart ID=" + item1.getCart().getId());
            System.out.println("item2 ID=" + item2.getId() + ", Foreign Key Cart ID=" + item1.getCart().getId());

        } catch (Exception e) {
            System.out.println("Exception occured. " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (!sessionFactory.isClosed()) {
                System.out.println("Closing SessionFactory");
                sessionFactory.close();
            }
        }
    }

}
