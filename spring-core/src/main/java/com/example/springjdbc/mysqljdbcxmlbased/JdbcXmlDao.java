package com.example.springjdbc.mysqljdbcxmlbased;

import com.example.springjpa.pojos.Country;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbcXmlDao implements XmlDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcXmlDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void showOff() {
        // list databases
        System.out.println("----------- databases ----------");
        jdbcTemplate.query("show databases;", rs -> {
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        });

        // show tables
        System.out.println("\n----------- tables ----------");
        jdbcTemplate.query("show tables;", rs -> {
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        });

        // query table
        System.out.println("\n----------- query table ----------");
        jdbcTemplate.query("select * from countries;", rs -> {
            while (rs.next()) {
                System.out.printf("id = %5s, name =%10s%n", rs.getInt("id"), rs.getString("name"));
            }
        });

        System.out.println("\n----------- query table and populate data to a list of Country objects ----------");
        List<Country> countryList = jdbcTemplate.query(
                "select * from countries;",
                (rs, rowNum) -> {
                    Country country = new Country(rs.getInt("id"), rs.getString("name"));
                    return country;
                }
        );
        countryList.forEach(System.out::println);

        System.out.println("\n----------- count rows in table ----------");
        Integer count = jdbcTemplate.queryForObject("select count(*) from countries;", Integer.class);
        System.out.println("count = " + count);

        System.out.println("\n----------- query for country name in table ----------");
        String name = jdbcTemplate.queryForObject("select name from countries where id = 1;", String.class);
        System.out.println("country name = " + name);

        System.out.println("\n----------- query for country in table and populate country object ----------");
        Country c = jdbcTemplate.queryForObject(
                "select * from countries where id = ?;",
                (rs, rowNum) -> {
                    return new Country(rs.getInt("id"), rs.getString("name"));
                },
                1
        );
        System.out.println(c);

        System.out.println("\n----------- insert new country in table ----------");

        jdbcTemplate.update(
                "delete from countries where name = ?",
                "UK"
        );

        jdbcTemplate.update(
                "insert into countries (id, name) values (?, ?);",
                8, "UK"
        );
        countryList = jdbcTemplate.query(
                "select * from countries;",
                (rs, rowNum) -> {
                    Country country = new Country(rs.getInt("id"), rs.getString("name"));
                    return country;
                }
        );
        countryList.forEach(System.out::println);


    }

}
