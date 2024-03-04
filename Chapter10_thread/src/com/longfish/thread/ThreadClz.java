package com.longfish.thread;

import org.junit.Test;

import java.util.Arrays;

public class ThreadClz {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("1s ZhiHou");

        new Thread(new Sleep()).start();
    }

    @Test
    public void test2() throws InterruptedException {
        Thread thread1 = new Thread(new Sleep());
        thread1.start();

        System.out.println("1111");
        thread1.join();
        System.out.println("2222");
    }

    @Test
    public void test3(){
        System.out.println("临时线程:"+new Thread(new Sleep()).getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority());
    }

    @Test
    public void test4(){
        System.out.println(Arrays.asList(Thread.MIN_PRIORITY, Thread.NORM_PRIORITY, Thread.MAX_PRIORITY));
        System.out.println("线程优先级范围:" + Arrays.asList(Thread.MIN_PRIORITY, Thread.MAX_PRIORITY));
    }


}

class Sleep implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1145);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1145");
    }
}
