package com.ziheng733.demo.jdk8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LambdaScopesTest {

    private LambdaScopes lambdaScopes;

    @Before
    public void setUp(){
        lambdaScopes = new LambdaScopes();
    }

    @After
    public void tearDown(){
        lambdaScopes = null;
    }

    @Test
    public void testLocalVariableWithFinal(){
        String actual = lambdaScopes.changeLocalVariableWithFinal(9);
        Assert.assertTrue("10".equals(actual));
    }

    @Test
    public void testLocalVariableWithoutFinal(){
        String actual = lambdaScopes.changeLocalVariableWithoutFinal(9);
        Assert.assertTrue("10".equals(actual));
    }

    @Test
    public void testChangeField(){
        String actual = lambdaScopes.changeField(9);
        Assert.assertTrue("10".equals(actual));
    }

    @Test
    public void testChangeStaticField(){
        String actual = lambdaScopes.changeStaticField(9);
        Assert.assertTrue("20".equals(actual));
    }
}
