package com.example.springcore.annotationsbased.config;

import com.example.springcore.annotationsbased.dao.AnotherDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// @Configuration can be used to define beans explicitly as opposed to using
// @Component/@Service/@Repository etc
@Configuration
public class AnotherConfig {

    // @Bean
    // we can explicitly define beans using @Bean
    // by default bean name is same as the method name
    // defining the bean

    // @Primary
    // if there are 2 beans of same class but different names, and
    // they are not being autowired with their specific names, but
    // with default bean name (AnotherDao -> anotherDao)
    // spring will try picking up 1 bean, but will fail so because there
    // are more than 1, in such scenario use @Primary to define precedence
    // where proper qualifier is not provided during autowiring

    // @Qualifier annotation can be used to specify which particular bean
    // should be picked while autowiring (constructor/setter/field injections)


    @Bean
    @Primary
    public AnotherDao anotherDao1(){
        return new AnotherDao();
    }

    @Bean
    @Qualifier(value = "xyz")
    public AnotherDao anotherDao2(){
        return new AnotherDao();
    }

}
