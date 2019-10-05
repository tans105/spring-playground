package com.tanmay.spring.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 29/09/19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/annotations/config.xml");
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
    }
}
