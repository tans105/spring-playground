package com.tanmay.spring.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ProductService prod = (ProductService) ctx.getBean("productService");
        System.out.println(prod.multiply(2, 3));
    }
}
