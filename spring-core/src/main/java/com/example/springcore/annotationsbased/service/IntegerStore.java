package com.example.springcore.annotationsbased.service;

import org.springframework.stereotype.Service;

@Service
public class IntegerStore implements GenericStore<Integer> {
    @Override
    public void setupStore(Integer i) {
        System.out.printf("%n--------- setting up Integer Store = %s---------", i);
    }
}
