package com.tanmay.springjdbc.employee.test;

import com.tanmay.springjdbc.employee.dao.EmployeeDao;
import com.tanmay.springjdbc.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = new Employee();
        emp.setFirstName("Manisha");
        emp.setLastName("Ojhaa");
        emp.setId(6);

        EmployeeDao dao = (EmployeeDao) ctx.getBean("empDao");
        System.out.println(dao.delete(emp));
        System.out.println(dao.create(emp));
        System.out.println(dao.update(emp));

        System.out.println(dao.read(6));

        System.out.println(dao.readAll());
    }
}
