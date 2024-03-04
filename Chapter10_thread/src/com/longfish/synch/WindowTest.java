package com.longfish.synch;

class Window implements Runnable{
static int ticket = 10000;
static final int max = ticket;
static final Object listener = new Object();
    @Override
    public void run() {
        while (true){

            synchronized (listener) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票票号" + (max + 1 - ticket--));
                }
                else break;

            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {

        new Thread(new Window()).start();
        new Thread(new Window()).start();
        new Thread(new Window()).start();


    }
}
