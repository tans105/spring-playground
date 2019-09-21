package com.tanmay.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class Test {
    public static void main(String[] args) {
        //Create a spring container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println("Employee ID " + emp.getId() + " Employee name " + emp.getName());
    }
}
