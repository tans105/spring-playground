package com.tanmay.spring.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

    @Override
    public void createOrder() {
        System.out.println("Inside Order DAO create order");
    }
}
