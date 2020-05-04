package com.ziheng733.demo.jdk8.thread;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private String command;

    public MyCallable(String command){
        this.command = command;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " StartTime = " + new Date());
        String result = processCommand();
        System.out.println(Thread.currentThread().getName() + " EndTime = " + new Date());
        return result;
    }

    private String processCommand(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return "result of " + command;
    }

    @Override
    public String toString() {
        return "command: " + command;
    }
}
