package com.example.springcore.annotationsbased.dao;

import org.springframework.stereotype.Repository;


// spring container automatically initializes a DummyDao instance and
// registers a bean named dummyDao
@Repository
public class DummyDao {
    private DummyDao(){}
}
