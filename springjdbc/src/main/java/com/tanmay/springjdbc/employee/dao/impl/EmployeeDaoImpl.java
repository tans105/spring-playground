package com.tanmay.springjdbc.employee.dao.impl;

import com.tanmay.springjdbc.employee.dao.EmployeeDao;
import com.tanmay.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.tanmay.springjdbc.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("empDao")
public class EmployeeDaoImpl implements EmployeeDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Employee emp) {
        String sql = "insert into people (id, first_name, last_name, age) values (?,?,?,?)";
        int result = jdbcTemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName(), 26);
        return result;
    }

    @Override
    public int update(Employee emp) {
        String sql = "update people set first_name = ?, last_name = ? where id = ?";
        int result = jdbcTemplate.update(sql, emp.getFirstName(), emp.getLastName(), emp.getId());
        return result;
    }

    @Override
    public int delete(Employee emp) {
        String sql = "delete from people where id = ?";
        int result = jdbcTemplate.update(sql, emp.getId());
        return result;
    }

    @Override
    public Employee read(int id) {
        String sql = "select * from people where id = ?";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        Employee emp = (Employee) jdbcTemplate.queryForObject(sql, rowMapper, id);
        return emp;
    }

    @Override
    public List<Employee> readAll() {
        String sql = "select * from people";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        List<Employee> emp = jdbcTemplate.query(sql, rowMapper);
        return emp;
    }
}
