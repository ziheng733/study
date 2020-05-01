package com.ziheng733.demo.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array2List<T> {

    public List<T> arr2List(T[] arr){
        return Arrays.stream(arr).collect(Collectors.toList());
    }
}
