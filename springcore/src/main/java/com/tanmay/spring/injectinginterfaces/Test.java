package com.tanmay.spring.injectinginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("injectinginterfaces/config.xml");
//        OrderBO bo = (OrderBO) ctx.getBean("bo");
//        bo.placeOrder();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("injectinginterfaces/configAnnotations.xml");
        OrderBO bo = (OrderBO) ctx.getBean("bo");
        bo.placeOrder();
    }
}
