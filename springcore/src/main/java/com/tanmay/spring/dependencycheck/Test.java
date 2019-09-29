package com.tanmay.spring.dependencycheck;

import com.tanmay.spring.beanlifecycle.xmlconfig.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 22/09/19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dependencycheck/config.xml");
        Prescription p = (Prescription) ctx.getBean("presciption");
        System.out.println(p);
    }
}
