package com.tanmay.spring.beanlifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Tanmay
 * @date 22/09/19
 **/
public class Patient implements InitializingBean, DisposableBean {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside After properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy ");
    }
}
