package com.tanmay.spring.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 06/10/19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("stereotypeAnnotations/config.xml");
        Instructor i = (Instructor) ctx.getBean("inst");
        System.out.println(i);
    }
}
