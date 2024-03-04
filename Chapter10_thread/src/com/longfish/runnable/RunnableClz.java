package com.longfish.runnable;

public class RunnableClz implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":hello");
        System.out.println(Thread.currentThread().getName() + ":hello");
        System.out.println(Thread.currentThread().getName() + ":hello");
    }
}
