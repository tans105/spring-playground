package com.tanmay.spring.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Tanmay
 * @date 29/09/19
 **/
public class Employee {

    @Autowired
    @Qualifier(value = "address")
    private Address address;

    public Address getAddress() {
        return address;
    }

    @Autowired
    public Employee(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

}
