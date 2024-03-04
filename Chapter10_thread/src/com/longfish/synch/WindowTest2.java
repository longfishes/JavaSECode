package com.longfish.synch;

class Window2 implements Runnable{
    static int ticket = 10000;
    static final int max = ticket;
    @Override
    public void run() {
        while (true){

            synchronized (Window2.class) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票票号" + (max + 1 - ticket--));
                }
                else break;

            }
        }
    }
}
public class WindowTest2 {
    public static void main(String[] args) {

        new Thread(new Window2()).start();
        new Thread(new Window2()).start();
        new Thread(new Window2()).start();


    }
}
