package com.tanmay.spring.list;

import java.util.Map;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getProducts() {
        return products;
    }

    public void setProducts(Map<String, String> products) {
        this.products = products;
    }

    private Map<String, String> products;
}
