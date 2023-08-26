package com.example.springcorexml.dao;

public class JpaItemDao implements ItemDao{
    @Override
    public String getClassName() {
        return JpaItemDao.class.getName();
    }
}
