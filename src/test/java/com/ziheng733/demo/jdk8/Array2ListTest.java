package com.ziheng733.demo.jdk8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Array2ListTest {

    private Array2List<String> array2List;

    @Before
    public void setUp(){
        array2List = new Array2List<>();
    }

    @Test
    public void testArray2List(){
        String[] arr = {"a", "b", "ccc"};
        List<String> list = array2List.arr2List(arr);
        Assert.assertTrue(list.size() == 3);
        Assert.assertTrue(list.get(1).equals("b"));
    }

    @After
    public void tearDown(){

    }

}
