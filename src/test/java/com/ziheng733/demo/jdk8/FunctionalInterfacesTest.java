package com.ziheng733.demo.jdk8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunctionalInterfacesTest {

    FunctionalInterfaces.Converter<String, Integer> converter;

    @Before
    public void setUp(){
         converter = from -> Integer.parseInt(from);
    }

    @After
    public void tearDown(){
        converter = null;
    }

    @Test
    public void testConvert(){
        Assert.assertTrue(777 == converter.convert("777"));
    }
}
