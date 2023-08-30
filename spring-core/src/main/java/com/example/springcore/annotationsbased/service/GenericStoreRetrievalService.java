package com.example.springcore.annotationsbased.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericStoreRetrievalService {
    private GenericStore<String> store1;
    private GenericStore<Integer> store2;

    // Using generics as Autowiring qualifiers
    // Spring will automatically inject stringStore bean to store1
    // Spring will automatically inject integerStore bean to store2
    @Autowired
    public GenericStoreRetrievalService(GenericStore<String> store1, GenericStore<Integer> store2) {
        this.store1 = store1;
        this.store2 = store2;

        this.store1.setupStore("XYZ");
        this.store2.setupStore(123);
    }
}
