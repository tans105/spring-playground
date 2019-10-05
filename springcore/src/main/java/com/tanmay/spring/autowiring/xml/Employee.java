package com.tanmay.spring.autowiring.xml;

/**
 * @author Tanmay
 * @date 29/09/19
 **/
public class Employee {

    private Address address;
    private Address address2;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(Address address, Address address2) {
        this.address = address;
        this.address2 = address2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", address2=" + address2 +
                '}';
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }
}
