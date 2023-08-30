package com.example.springcore.xmlbased.dao;

public class JpaAccountDao implements AccountDao{

    public final int id;

    public JpaAccountDao(int id) {
        System.out.printf("%-50s%s%n", "constructor invoked in ", JpaAccountDao.class.getName());
        this.id = id;
    }

    @Override
    public String getClassName() {
        return JpaAccountDao.class.getName();
    }
}
