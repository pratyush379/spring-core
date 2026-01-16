package org.example;
//added this class to show how we can work on both xml based and annotation based work in spring core

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")
@ImportResource("classpath:spring.xml")
@PropertySource("classpath:db2.properties")
public class AppConfig {
    @Value("${db.driver}")
    private String driver;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    // DataSource Bean
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

    // JdbcTemplate Bean
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    // Employee DAO Bean
    @Bean
    public ManagerDao managerDao(JdbcTemplate jdbcTemplate) {
        ManagerDao dao = new ManagerDao();
        dao.setJdbcTemplate(jdbcTemplate);
        return dao;
    }
    public AppConfig() {
    }
}
