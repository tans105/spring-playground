package com.tanmay.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

    @Autowired
    Dao dao;

    public void save() {
        dao.create();
    }

    public void init() {
        System.out.println("Init!");
    }

    public void destroy() {
        System.out.println("Destroy");
    }
}
