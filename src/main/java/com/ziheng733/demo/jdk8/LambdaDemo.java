package com.ziheng733.demo.jdk8;

public class LambdaDemo {

    public static void main(String args[]) {
        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (int a, int b) -> {return a * b;};

        MathOperation division = (int a, int b) -> a / b;

        LambdaDemo lambdaDemo = new LambdaDemo();
        System.out.println("7 + 3 = " + lambdaDemo.operate(7, 3, addition));
        System.out.println("7 - 3 = " + lambdaDemo.operate(7, 3, subtraction));
        System.out.println("7 * 3 = " + lambdaDemo.operate(7, 3, multiplication));
        System.out.println("7 / 3 = " + lambdaDemo.operate(7, 3, division));

        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);

        greetingService1.sayMessage("boys");
        greetingService2.sayMessage("girls");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
