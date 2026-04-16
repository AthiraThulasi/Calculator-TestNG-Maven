package org.athira;

public class Calculator {

    public double add(int a, int b) {
        return a + b;
    }

    public double subtract(int number1, int number2) {
        //System.out.println("number1" + number1);
        //System.out.println("number2" + number2);
        return number1 - number2;
    }

    public double multiply(int number1, int number2) {
        //System.out.println("number1" + number1);
        //System.out.println("number2" + number2);
        return number1 * number2;
    }

    public double divide(int number1, int number2) {
        //System.out.println("number1" + number1);
        //System.out.println("number2" + number2);
        if (number2 == 0){
            throw new ArithmeticException();
        }
        return (double) number1/number2;


    }


}
