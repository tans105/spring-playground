package com.tanmay.spring.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 06/10/19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("standaloneCollections/config.xml");
        ProductNames n = (ProductNames) ctx.getBean("productNamesBean");
        System.out.println(n);
    }
}
