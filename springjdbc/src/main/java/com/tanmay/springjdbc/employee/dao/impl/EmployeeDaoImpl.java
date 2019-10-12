package com.tanmay.springjdbc.employee.dao.impl;

import com.tanmay.springjdbc.employee.dao.EmployeeDao;
import com.tanmay.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

    public JdbcTemplate getjdbcTemplate() {
        return jdbcTemplate;
    }

    public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Employee emp) {
        String sql = "insert into people (id, first_name, last_name, age) values (?,?,?,?)";
        int result = jdbcTemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName(), 26);
        return result;
    } 
}
