package com.ziheng733.demo.jdk8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultMethods4InterfacesTest {

    private DefaultMethods4Interfaces.Formula formula;

    @Before
    public void setUp(){
         formula = new DefaultMethods4Interfaces.Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
    }

    @After
    public void tearDown(){
        formula = null;
    }

    @Test
    public void testCalculate(){
        double actual = formula.calculate(100);
        Assert.assertTrue(Double.valueOf(100).equals(actual));
    }

    @Test
    public void testSqrt(){
        double actual = formula.sqrt(100);
        Assert.assertTrue(Double.valueOf(10) == actual);
    }

    @Test
    public void testPrintB(){
        Assert.assertTrue(10 == formula.printB(10));
    }

}
