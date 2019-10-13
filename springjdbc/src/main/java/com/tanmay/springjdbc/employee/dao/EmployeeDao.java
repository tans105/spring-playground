package com.tanmay.springjdbc.employee.dao;

import com.tanmay.springjdbc.employee.dto.Employee;

import java.util.List;

public interface EmployeeDao {

    int create(Employee emp);

    int update(Employee emp);

    int delete(Employee emp);

    Employee read( int id);

    List<Employee> readAll();
}
