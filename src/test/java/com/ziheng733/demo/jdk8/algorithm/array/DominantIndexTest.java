package com.ziheng733.demo.jdk8.algorithm.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DominantIndexTest {

    private DominantIndex dominantIndex;

    @Before
    public void setup(){
        dominantIndex = new DominantIndex();
    }

    @Test
    public void testPivotIndex(){
        int[] array = {1,7,3,6,5,6};
        int result = dominantIndex.dominantIndex(array);
        Assert.assertTrue(result == -1);

        int[] array1 = {1,12,3,0,5,6};
        int result1 = dominantIndex.dominantIndex(array);
        Assert.assertTrue(result1 == 1);

    }

    @After
    public void teardown(){
    }
}
