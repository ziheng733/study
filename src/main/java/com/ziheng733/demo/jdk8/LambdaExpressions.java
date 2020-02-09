package com.ziheng733.demo.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda表达式
 */
public class LambdaExpressions {

    public static void main(String[] args){
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        oldSchool(names);
        System.out.println(names);
        newLambda(names);
        System.out.println(names);
    }

    private static void oldSchool(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private static void newLambda(List<String> names){
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
    }



}
