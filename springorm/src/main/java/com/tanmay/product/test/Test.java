package com.tanmay.product.test;

import com.tanmay.product.dao.ProductDao;
import com.tanmay.product.dao.impl.ProductDaoImpl;
import com.tanmay.product.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ProductDao dao = (ProductDao) ctx.getBean("productDao");
        Product prod = new Product();
        prod.setDesc("Tanmay is awesome");
        prod.setId(2);
        prod.setName("Tanmay");
//        prod.setPrice(100);
        dao.create(prod);
//        prod.setPrice(700);
//        dao.update(prod);
//        dao.delete(prod);
        System.out.println(dao.read(1));
        System.out.println(dao.read());
    }
}
