package com.tanmay.spring.setterinjection;

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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("setterinjection/config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println("Employee ID " + emp.getId() + " Employee name " + emp.getName());

        Hospital hosp = (Hospital) ctx.getBean("hosp");
        System.out.println(hosp.getDepartments());

        CarDealer dealer = (CarDealer) ctx.getBean("dealer");
        System.out.println(dealer.getModels() + " " + dealer.getModels().getClass());

        Customer cust = (Customer) ctx.getBean("customer");
        System.out.println(cust.getProducts());

        Languages lang = (Languages) ctx.getBean("lang");
        System.out.println(lang.getCountriesAndLanguages()  );

        Student stu = (Student) ctx.getBean("student");
        System.out.println(stu.getScores());
    }
}
