package com.example.springcore.annotationsbased.service;

import com.example.springcore.annotationsbased.dao.AnotherDao;
import com.example.springcore.annotationsbased.dao.DummyDao;
import org.springframework.stereotype.Service;

@Service
public class AnotherService {
    private AnotherDao anotherDao;
    public AnotherService(AnotherDao anotherDao) {
        this.anotherDao = anotherDao;
    }
}
