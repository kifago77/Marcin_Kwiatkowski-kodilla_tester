package com.kodilla.basic_assertion;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sumNumber(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }
    @Test
    public  void testSquare(){
        Calculator calculator = new Calculator();
        int a = 5;
        int squResult = calculator.square(a);
        assertEquals(25, squResult);

    }
    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int diviResult = calculator.division(a, b);
        assertEquals(40, diviResult);
    }
}
