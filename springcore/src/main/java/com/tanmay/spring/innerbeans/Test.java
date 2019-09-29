package com.tanmay.spring.innerbeans;

import com.tanmay.spring.dependencycheck.Prescription;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 22/09/19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("innerbeans/config.xml");
        Employee p = (Employee) ctx.getBean("employee");
        System.out.println(p.hashCode());
        Employee p2 = (Employee) ctx.getBean("employee");
        System.out.println(p2.hashCode());
    }
}
