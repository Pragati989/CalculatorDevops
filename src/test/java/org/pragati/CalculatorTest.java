package org.pragati;

import org.junit.*;
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp()
    {
       calculator=new Calculator();
    }


    public void testAdd()
    {
        int value1=4567;
        int value2=8888;
        int expectedResult=3455;
        int result=calculator.add(value1,value2);
        Assert.assertEquals(expectedResult,result);
    }
}
