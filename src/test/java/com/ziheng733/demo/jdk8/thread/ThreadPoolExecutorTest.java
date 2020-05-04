package com.ziheng733.demo.jdk8.thread;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ThreadPoolExecutorTest {

    private ThreadPoolExecutor threadPoolExecutor;

    @Before
    public void setup(){
        int corePoolSize = 5;
        int maximumPoolSize = 10;
        long keepAliveTime = 1L;
        int queueCapacity = 1000;
        threadPoolExecutor = new ThreadPoolExecutor(
                corePoolSize, maximumPoolSize, keepAliveTime,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(queueCapacity),
                new NamedThreadFactory("testTheadPoolExecutor"),
                new ThreadPoolExecutor.AbortPolicy()
        );
    }

    @Test
    public void testExecute(){
        IntStream.range(0, 10).forEach(i -> {
            Runnable runnable = new MyRunnable("" + i);
            System.out.println("runnable command:" + runnable);
            threadPoolExecutor.execute(runnable);
        });
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()){
        }
        System.out.println("Finished all threads");

    }

    @Test
    public void testSummit() throws InterruptedException, ExecutionException, TimeoutException {
        Future<String> future = threadPoolExecutor.submit(new MyCallable("my callable"));
        String result = future.get(1000l, TimeUnit.MILLISECONDS);
        Assert.assertTrue("result of my callable".equals(result));
    }

    @After
    public void teardown(){
        threadPoolExecutor = null;
    }
}
