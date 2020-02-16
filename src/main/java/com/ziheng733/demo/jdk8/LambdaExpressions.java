package com.ziheng733.demo.jdk8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda表达式
 */
public class LambdaExpressions {

    public List<String> oldSchoolCompare(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return names;
    }

    public List<String> newCompare(List<String> names){
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
        return names;
    }



}
