package com.cal.test;


import org.athira.Calculator;// this is the package where main calculator class is in
import static org.testng.Assert.*;// static import, so that we don't need to use Assert class
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    // To test the add() of calculator class
    private Calculator calc = new Calculator();// use this as instance variable

    //String data = {"smoke","sanity"}
    @Test(description = "Verify Calculator add functionality", groups = {"smoke", "sanity"})
    public void add_TwoIntegerNumbers_returnSum() {
        //Calculator calc = new Calculator();// to access the calculator class
        assertEquals(calc.add(110, 111), 221.0);
    }

    @Test(description = "Verify Calculator subtract functionality", groups = {"smoke", "sanity"})
    public void subtract_TwoIntegerNumbers_returnResult() {
        //Calculator calc = new Calculator();// to access the calculator class
        assertEquals(calc.subtract(500, 100), 400.0);
    }

    @Test(description = "Verify Calculator multiply functionality", groups = {"smoke", "sanity"})
    public void multiply_TwoIntegerNumbers_returnResult() {
        //Calculator calc = new Calculator();// to access the calculator class
        assertEquals(calc.multiply(10, 111), 1110.0);
    }

    @Test(description = "Verify Calculator divide functionality", groups = {"smoke", "sanity"})
    public void divide_TwoIntegerNumbers_returnResult() {
        //Calculator calc = new Calculator();// to access the calculator class
        assertEquals(calc.divide(110, 1), 110.0);
    }

    /*@Test(description = "Verify Calculator division functionality", groups = {"unit","smoke", "sanity"},expectedExceptions = ArithmeticException.class)
    public void divide_DivideNumberByZero_throwArithematicException() {
        //Calculator calc = new Calculator();// to access the calculator class
       calc.divide(20, 0);*/


}
