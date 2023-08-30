package com.example.springcore.annotationsbased.service;

import com.example.springcore.annotationsbased.dao.DummyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceConstructorInjection {
    public DummyDao dummyDao;

    @Autowired
    public DummyServiceConstructorInjection(DummyDao dummyDao) {
        this.dummyDao = dummyDao;
    }
}
