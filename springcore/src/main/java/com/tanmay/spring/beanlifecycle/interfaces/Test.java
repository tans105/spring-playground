package com.tanmay.spring.beanlifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 22/09/19
 **/
public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beanlifecycle/interfaces/config.xml");
        Patient p = (Patient) ctx.getBean("patient1");
        ctx.registerShutdownHook();//AbstractApplicationContext only can invoke the destroy method
    }
}
