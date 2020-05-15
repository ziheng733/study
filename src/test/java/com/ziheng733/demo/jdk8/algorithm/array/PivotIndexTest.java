package com.ziheng733.demo.jdk8.algorithm.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PivotIndexTest {

    private PivotIndex pivotIndex;

    @Before
    public void setup(){
        pivotIndex = new PivotIndex();
    }

    @Test
    public void testPivotIndex(){
        int[] array = {1,7,3,6,5,6};
        int result = pivotIndex.pivotIndex(array);
        Assert.assertTrue(result == 3);
    }

    @After
    public void teardown(){
    }
}
