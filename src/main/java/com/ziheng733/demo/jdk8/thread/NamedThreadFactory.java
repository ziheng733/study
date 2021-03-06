package com.ziheng733.demo.jdk8.thread;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;


public class NamedThreadFactory implements ThreadFactory {
    private static final AtomicInteger POOL_SEQ = new AtomicInteger(1);

    private final AtomicInteger mThreadNum = new AtomicInteger(1);

    private final String mPrefix;

    private final boolean mDaemo;

    private final ThreadGroup mGroup;

    public NamedThreadFactory(){
        this("pool-" + POOL_SEQ.getAndIncrement(),false);
    }
    /**
     * 构造函数
     * @param prefix
     * 		线程名称的前缀,设置当前为非常驻线程
     */
    public NamedThreadFactory(String prefix){
        this(prefix,false);
    }
    /**
     * 构造函数
     * @param prefix
     * 		线程名称的前缀名
     * @param daemo
     * 		是否设置为daemo线程
     */
    public NamedThreadFactory(String prefix,boolean daemo){
        mPrefix = prefix + "-thread-";
        mDaemo = daemo;
        SecurityManager s = System.getSecurityManager();
        mGroup = ( s == null ) ? Thread.currentThread().getThreadGroup() : s.getThreadGroup();
    }

    public Thread newThread(Runnable runnable){
        String name = mPrefix + mThreadNum.getAndIncrement();
        Thread ret = new Thread(mGroup,runnable,name,0);
        ret.setDaemon(mDaemo);
        return ret;
    }

    public ThreadGroup getThreadGroup(){
        return mGroup;
    }

}