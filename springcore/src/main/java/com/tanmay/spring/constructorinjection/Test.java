package com.tanmay.spring.constructorinjection;

import com.tanmay.spring.ambiguity.Ambiguity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ta672972
 * @date 29/09/19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection/config.xml");
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
    }
}
