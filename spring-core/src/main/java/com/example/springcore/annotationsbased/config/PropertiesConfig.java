package com.example.springcore.annotationsbased.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:app-config.properties")
public class PropertiesConfig {

    String propertyNo1;
    String propertyNo2;
    List<String> listProperty;
    int intProperty;

    public PropertiesConfig(
            @Value("${propertyNo1}") String propertyNo1,
            @Value("${propertyNo2:Defaulted To This}") String propertyNo2,
            @Value("${listProperty}") List<String> listProperty,
            @Value("${intProperty}") int intProperty

    ) {
        this.propertyNo1 = propertyNo1;
        this.propertyNo2 = propertyNo2;
        this.listProperty = listProperty;
        this.intProperty = intProperty;

        System.out.printf("%n----------------- Properties ------------------- %n");
        System.out.printf("%n %s ------> propertyNo1=%s", PropertySource.class.getName(), propertyNo1);
        System.out.printf("%n %s ------> propertyNo2=%s", PropertySource.class.getName(), propertyNo2);
        System.out.printf("%n %s ------> listProperty=%s", PropertySource.class.getName(), listProperty);
        System.out.printf("%n %s ------> intProperty=%s", PropertySource.class.getName(), intProperty);
        System.out.printf("%n----------------- Properties ------------------- %n");

    }
}
