package com.tanmay.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "insert into people (id, first_name, last_name, age) values (?,?,?,?)";
        int result = jdbcTemplate.update(sql, 4, "Tanmay", "Awasthi", 6);

        System.out.println(result);


    }
}
