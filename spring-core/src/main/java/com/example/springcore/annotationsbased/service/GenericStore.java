package com.example.springcore.annotationsbased.service;

public interface GenericStore<T> {

    void setupStore(T t);

}
