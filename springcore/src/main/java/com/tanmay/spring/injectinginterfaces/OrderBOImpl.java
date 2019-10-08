package com.tanmay.spring.injectinginterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }

    @Autowired
//    @Qualifier("dao")
    @Qualifier("dao2")
    private OrderDAO dao;

    @Override
    public void placeOrder() {
        System.out.println("Inside Order BO");
        dao.createOrder();
    }
}
