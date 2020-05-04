package com.ziheng733.demo.jdk8.thread;

import java.util.Date;

public class MyRunnable implements Runnable{

    private String command;

    public MyRunnable(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " StartTime = " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " EndTime = " + new Date());
    }

    /**
     * 模拟工作
     */
    private void processCommand() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
