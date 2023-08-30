package com.example.springcore.annotationsbased.service;

import com.example.springcore.annotationsbased.dao.DummyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceSetterInjection {

    private DummyDao dummyDao;

    @Autowired
    public void setDummyDao(DummyDao dummyDao) {
        this.dummyDao = dummyDao;
    }
}
