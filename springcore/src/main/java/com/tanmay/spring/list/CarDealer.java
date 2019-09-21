package com.tanmay.spring.list;

import java.util.List;
import java.util.Set;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class CarDealer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getModels() {
        return models;
    }

    public void setModels(Set<String> models) {
        this.models = models;
    }

    private Set<String> models;
}
