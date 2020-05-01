package com.ziheng733.demo.jdk8;

/**
 * Java 8使我们能够通过使用 default 关键字向接口(抽象类同理)添加非抽象方法实现。
 */
public class DefaultMethods4Interfaces{

    interface Formula{
        double calculate(int a);

        default double sqrt(int a){
            return Math.sqrt(a);
        }

        default int printB(int b){
            return b;
        }
    }

}
