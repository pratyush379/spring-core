package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ManagerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // setter injection
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveManager(int id, String name) {
        String sql = "INSERT INTO manager VALUES (?, ?)";
        jdbcTemplate.update(sql, id, name);
    }
}
