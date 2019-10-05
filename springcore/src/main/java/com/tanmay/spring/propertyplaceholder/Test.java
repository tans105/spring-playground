package com.tanmay.spring.propertyplaceholder;

import com.tanmay.spring.setterinjection.list.CarDealer;
import com.tanmay.spring.setterinjection.list.Customer;
import com.tanmay.spring.setterinjection.list.Hospital;
import com.tanmay.spring.setterinjection.list.Languages;
import com.tanmay.spring.setterinjection.primitive.Employee;
import com.tanmay.spring.setterinjection.reference.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class Test {
    public static void main(String[] args) {
        //Create a spring container
        ApplicationContext ctx = new ClassPathXmlApplicationContext("propertyPlaceholder/config.xml");
        MyDao emp = (MyDao) ctx.getBean("myDao");
        System.out.println(emp);

    }
}
