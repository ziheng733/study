package com.ziheng733.demo.jdk8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MethodAndConstructorReferencesTest {

    private MethodAndConstructorReferences methodAndConstructorReferences;

    @Before
    public void setUp(){
        methodAndConstructorReferences = new MethodAndConstructorReferences();
    }

    @After
    public void tearDown(){
        methodAndConstructorReferences = null;
    }

    @Test
    public void testStr2int(){
        Assert.assertEquals(123, methodAndConstructorReferences.str2int("123"));
    }

    @Test
    public void testStr2starts(){
        Assert.assertEquals("h", methodAndConstructorReferences.str2starts("hello"));
    }

    @Test
    public void testCreatePerson(){
        Assert.assertNotNull(methodAndConstructorReferences.createPerson());
    }


}
