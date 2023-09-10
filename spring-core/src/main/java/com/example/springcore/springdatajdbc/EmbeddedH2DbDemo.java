package com.example.springcore.springdatajdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmbeddedH2DbDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.example.springcore.springdatajdbc.h2db"
        );

        DataSource h2DataSource = context.getBean("dataSource", DataSource.class);


        // list databases
        System.out.println("----------- databases ----------");
        try (
                PreparedStatement preparedStatement = h2DataSource.getConnection().prepareStatement("show databases;");
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // show tables
        System.out.println("----------- tables ----------");
        try (
                PreparedStatement preparedStatement = h2DataSource.getConnection().prepareStatement("show tables;");
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // query table
        System.out.println("----------- query table ----------");
        try (
                PreparedStatement preparedStatement = h2DataSource.getConnection().prepareStatement("select * from countries;");
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                System.out.printf("id = %5s, name =%10s%n", resultSet.getInt("id"), resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
