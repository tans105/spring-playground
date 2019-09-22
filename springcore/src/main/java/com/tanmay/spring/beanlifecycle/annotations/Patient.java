package com.tanmay.spring.beanlifecycle.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Tanmay
 * @date 22/09/19
 **/
public class Patient {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    @PostConstruct
    public void hi() {//init method
        System.out.println("Inside Hi method");
    }

    @PreDestroy
    public void bye() {//destroy method
        System.out.println("Inside Bye");
    }
}
