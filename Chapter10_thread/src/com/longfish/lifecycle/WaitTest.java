package com.longfish.lifecycle;


public class WaitTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            while (true) System.out.println(1111);
        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            while (true) System.out.println(2222);
        });
        thread2.start();

        thread1.wait();
        Thread.sleep(10000);
        thread1.notify();
        thread1.wait();
        thread1.join();

    }
}
