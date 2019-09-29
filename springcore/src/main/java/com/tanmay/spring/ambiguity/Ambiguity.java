package com.tanmay.spring.ambiguity;

/**
 * @author Tanmay
 * @date 29/09/19
 **/
public class Ambiguity {

    Ambiguity(int a, int b) {
        System.out.println("Inside constructor int");
    }

    Ambiguity(double a, double b) {
        System.out.println("Inside constructor double");
    }

    Ambiguity(String a, String b) {
        System.out.println("Inside constructor String");
    }
}
