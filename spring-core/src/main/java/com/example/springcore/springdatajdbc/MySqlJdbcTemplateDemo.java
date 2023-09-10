package com.example.springcore.springdatajdbc;

import com.example.springcore.springdatajdbc.countryDbDaos.CountryDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySqlJdbcTemplateDemo {

    // todo - mysql db needs to be setup locally for this to work, refer ref-materials/mysql
    public static void main(String[] args) {

        // note that mysqldb package is added in context
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.example.springcore.springdatajdbc.mysqldb",
                "com.example.springcore.springdatajdbc.countryDbDaos"
        );

        CountryDao dao = context.getBean("jdbcCountryDao", CountryDao.class);
        dao.showOff();
    }

}
