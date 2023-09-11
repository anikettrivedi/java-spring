package com.example.springdata.embeddedjdbc;

import com.example.springdata.embeddedjdbc.dao.CountryDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmbeddedH2JdbcTemplateDemo {

    public static void main(String[] args) {

        // note that h2db package is added in context
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.example.springdata.embeddedjdbc"
        );

        CountryDao dao = context.getBean("jdbcCountryDao", CountryDao.class);
        dao.showOff();
    }

}
