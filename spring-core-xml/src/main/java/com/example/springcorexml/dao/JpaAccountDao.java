package com.example.springcorexml.dao;

public class JpaAccountDao implements AccountDao{
    @Override
    public String getClassName() {
        return JpaAccountDao.class.getName();
    }
}
