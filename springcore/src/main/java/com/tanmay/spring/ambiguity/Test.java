package com.tanmay.spring.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 29/09/19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ambiguity/config.xml");
//        Ambiguity amb1 = (Ambiguity) ctx.getBean("ambiguity");

    }
}
