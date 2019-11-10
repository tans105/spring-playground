package com.tanmay.spring.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Dao dao = ctx.getBean(Dao.class);
//        dao.create();

        Service service = ctx.getBean(Service.class);
        service.save();
        System.out.println(service.hashCode());
        Service service1 = ctx.getBean(Service.class);
        System.out.println(service.hashCode());
        ctx.close();

    }
}
