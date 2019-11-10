package com.tanmay.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //Tells this class is an aspect
public class LogginAspect {

    /**
     * We will create 2 advices @Before and @After type
     */


    @Before("execution( * com.tanmay.spring.springaop.ProductServiceImpl.multiply(..))") //Annotation needs a point cut expression.
    /*
    com.tanmay.spring.springaop.ProductServiceImpl.multiply(..) implies
     - any return type, any access identifier,
     - class should be com.tanmay.spring.springaop.ProductServiceImpl,
     - method name should be multiply
     - Can take an parameters
    */
    public void logBefore(JoinPoint joinPoint) {//Using join point, we can access method's parameter
        System.out.println("Before calling the method");
    }

    @After("execution( * com.tanmay.spring.springaop.ProductServiceImpl.multiply(..))") //Annotation needsa a point cut expression
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After calling the method");
    }
}
