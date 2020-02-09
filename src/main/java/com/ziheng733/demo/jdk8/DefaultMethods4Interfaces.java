package com.ziheng733.demo.jdk8;

/**
 * Java 8使我们能够通过使用 default 关键字向接口(抽象类同理)添加非抽象方法实现。
 */
public class DefaultMethods4Interfaces {

    interface Formula{
        double calculate(int a);

        default double sqrt(int a){
            return Math.sqrt(a);
        }
    }

    public static void main(String[] args){
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println("this should be 100: " + formula.calculate(100));
        System.out.println("this should be 10: " + formula.sqrt(100));
    }

}
