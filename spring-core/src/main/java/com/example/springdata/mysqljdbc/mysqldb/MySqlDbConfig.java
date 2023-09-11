package com.example.springdata.mysqljdbc.mysqldb;

import com.mysql.cj.jdbc.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class MySqlDbConfig {

    @Bean
    public DataSource dataSource() throws SQLException {
        return new SimpleDriverDataSource(
                new Driver(),
                "jdbc:mysql://localhost:3306/external_db",
                "root",
                "password"
        );
    }

}
