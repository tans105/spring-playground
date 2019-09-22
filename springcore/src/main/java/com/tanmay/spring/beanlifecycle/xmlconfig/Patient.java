package com.tanmay.spring.beanlifecycle.xmlconfig;

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

    public void hi() {//init method
        System.out.println("Inside Hi method");
    }

    public void bye() {//destroy method
        System.out.println("Inside Bye");
    }
}
