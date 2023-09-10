package com.example.springcore.springdatajdbc;

import com.example.springcore.springdatajdbc.countryDbDaos.CountryDao;
import com.example.springcore.springdatajdbc.pojo.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmbeddedH2JdbcTemplateDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.example.springcore.springdatajdbc.h2DbConfig",
                "com.example.springcore.springdatajdbc.countryDbDaos"
        );

        CountryDao dao = context.getBean("jdbcCountryDao", CountryDao.class);
        dao.showOff();
    }

}
