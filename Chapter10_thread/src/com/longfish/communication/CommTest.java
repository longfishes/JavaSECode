package com.longfish.communication;

class Print implements Runnable{


    @Override
    public void run() {
        int i = 100;
        while (i-- > 0) {

            synchronized (Print.class) {
                System.out.println(Thread.currentThread().getName() + "-----------");
                try {
                    Print.class.notify();
                    Print.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}


public class CommTest {


    public static void main(String[] args) {

        Print p = new Print();

        new Thread(p).start();
        new Thread(p).start();




    }
}
