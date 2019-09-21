package com.tanmay.spring.list;

import java.util.List;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class Hospital {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    private List<String> departments;
}
