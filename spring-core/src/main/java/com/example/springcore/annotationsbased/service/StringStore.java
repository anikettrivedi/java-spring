package com.example.springcore.annotationsbased.service;

import org.springframework.stereotype.Service;

@Service
public class StringStore implements GenericStore<String> {
    @Override
    public void setupStore(String s) {
        System.out.printf("%n--------- setting up String Store = %s ---------", s);
    }
}
