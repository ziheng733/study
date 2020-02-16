package com.ziheng733.demo.jdk8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionsTest {

    private List<String> names;
    private LambdaExpressions lambdaExpressions;
    private List<String> inOrderNames;
    private List<String> reverseOrderNames;

    @Before
    public void setUp(){
        names = Arrays.asList("peter", "anna", "mike", "xenia");
        inOrderNames = Arrays.asList("anna", "mike", "peter", "xenia");
        reverseOrderNames = Arrays.asList("xenia", "peter", "mike", "anna");
        lambdaExpressions = new LambdaExpressions();
    }

    @After
    public void tearDown(){
        names = null;
    }

    @Test
    public void testOldSchoolCompare(){
        List<String> actual = lambdaExpressions.oldSchoolCompare(names);
        Assert.assertArrayEquals(
                inOrderNames.toArray(new String[inOrderNames.size()]),
                actual.toArray(new String[actual.size()]));
    }

    @Test
    public void testNewCompare(){
        List<String> actual = lambdaExpressions.newCompare(names);
        Assert.assertArrayEquals(
                reverseOrderNames.toArray(new String[reverseOrderNames.size()]),
                actual.toArray(new String[actual.size()]));
    }
}
