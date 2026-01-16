package org.example;


import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    // setter injection
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveEmployee(int id, String name) {
        String sql = "INSERT INTO employee VALUES (?, ?)";
        jdbcTemplate.update(sql, id, name);
    }
}
