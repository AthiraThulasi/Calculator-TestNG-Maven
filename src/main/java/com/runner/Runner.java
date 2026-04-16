package com.runner;

import org.athira.Calculator;

public class Runner {

    public static void main(String[] args) {

        Calculator cal = new Calculator() ;
        double result = cal.add(110,111);
        System.out.println("Result of addition is : " + result);

        result = cal.subtract(200,100);
        System.out.println("Result of subtraction is : " + result);

        result = cal.multiply(200,100);
        System.out.println("Result of multiplication is : " + result);

        result = cal.divide(200,0);
        System.out.println("Result of division is : " + result);


    }
}
