package com.tanmay.spring.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

    @Override
    public void createOrder() {
        System.out.println("Inside Order DAO Impl 2 create order");

    }
}
