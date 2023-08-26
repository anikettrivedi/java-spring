package com.example.springcorexml.dao;

public class JpaItemDao implements ItemDao{

    public final int id;
    public JpaItemDao(int id) {
        System.out.printf("%-50s%s%n", "constructor invoked in ", JpaItemDao.class.getName());
        this.id = id;
    }
    @Override
    public String getClassName() {
        return JpaItemDao.class.getName();
    }
}
