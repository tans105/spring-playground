package com.tanmay.spring.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Tanmay
 * @date 06/10/19
 **/

@Component(value = "inst")
@Scope(value = "prototype")
public class Instructor {

    //evaluation an expression
    //@Value("#{66+44}")

    //evaluate an expression using call a static method
    //@Value("#{T(java.lang.Math).abs(-99)}")

    //Create a new object, invoking a constructor
    //@Value("#{new Integer(88)}")

    //Calling a constant
    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    private String id;

    @Value("Tanmay")
    private String name;

    @Value("#{topics}")
    private List topics;

    @Autowired
    private Profile profile;

    @Override
    public String toString() {
        return "Instructor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getTopics() {
        return topics;
    }

    public void setTopics(List topics) {
        this.topics = topics;
    }
}
