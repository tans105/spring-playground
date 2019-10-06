package com.tanmay.spring.standaloneCollections;

import java.util.List;

/**
 * @author Tanmay
 * @date 06/10/19
 **/
public class ProductNames {
    private List<String> productList;

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ProductNames{" +
                "productList=" + productList +
                '}';
    }
}
