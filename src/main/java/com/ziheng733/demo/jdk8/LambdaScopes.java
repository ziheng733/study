package com.ziheng733.demo.jdk8;

/**
 * Lambda表达式作用域
 */
public class LambdaScopes {

    int outerNum;
    static int outerStaticNum;

    /**
     * lambda 表达式中访问外部的局部变量
     */
    public String changeLocalVariableWithFinal(int from){
        final int num = 1;
        FunctionalInterfaces.Converter<Integer, String> converter =
                fromInt -> String.valueOf(fromInt + num);
        return converter.convert(from);
    }

    /**
     *  但是和匿名对象不同的是，这里的变量num可以不用声明为final，该代码同样正确
     *  但是，后续不可以再修改该变量
     */
    public String changeLocalVariableWithoutFinal(int from){
        int num = 1;
        FunctionalInterfaces.Converter<Integer, String> converter =
                fromInt -> String.valueOf(fromInt + num);
        return converter.convert(from);
        // num = 3;
    }

    /**
     * 测试实例字段访问
     */
    public String changeField(int from){
        FunctionalInterfaces.Converter<Integer, String> converter = fromInt -> {
            outerNum = 1;
            return String.valueOf(fromInt + outerNum);
        };
        String result = converter.convert(from);
        outerNum = 111;
        return result;
    }

    /**
     * 测试静态变量访问
     */
    public String changeStaticField(int from){
        FunctionalInterfaces.Converter<Integer, String> converter = fromInt -> {
            outerStaticNum = 11;
            return String.valueOf(fromInt + outerStaticNum);
        };
        String result = converter.convert(from);
        outerStaticNum = 111;
        return result;
    }
}
