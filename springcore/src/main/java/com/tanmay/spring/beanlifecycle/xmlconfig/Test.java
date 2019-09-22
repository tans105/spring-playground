package com.tanmay.spring.beanlifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 22/09/19
 **/
public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beanlifecycle/xmlconfig/config.xml");
        Patient p = (Patient) ctx.getBean("patient");
        ctx.registerShutdownHook();//AbstractApplicationContext only can invoke the destroy method
    }
}
