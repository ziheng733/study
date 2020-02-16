package com.ziheng733.demo.jdk8;

/**
 * “函数式接口”是指仅仅只包含一个抽象方法,
 * 但是可以有多个非抽象方法(也就是DefaultMethods4Interfaces提到的默认方法)的接口。
 */
public class FunctionalInterfaces {

    @FunctionalInterface
    interface Converter<F, T>{
        T convert(F from);

        // void anotherAbstractMethod();
    }

}
