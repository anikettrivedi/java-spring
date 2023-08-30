package com.example.springcore.annotationsbased.service;

import com.example.springcore.annotationsbased.dao.DummyDao;
import org.springframework.stereotype.Service;

@Service
public class DummyService {
    private DummyDao dummyDao;

    // @Autowired
    // @Autowired is not need if DummyDao has just 1 constructor
    public DummyService(DummyDao dummyDao) {
        this.dummyDao = dummyDao;
    }
}
