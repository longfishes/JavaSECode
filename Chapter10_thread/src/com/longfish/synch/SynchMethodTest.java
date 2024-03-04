package com.longfish.synch;

class Window0 implements Runnable {
    static int ticket = 10000;
    static final int max = ticket;
    static boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag){
            sale();
        }

    }

    public static synchronized void sale(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "售票票号" + (max + 1 - ticket--));
        } else isFlag = false;
    }
}

public class SynchMethodTest {
    public static void main(String[] args) {

        new Thread(new Window0()).start();
        new Thread(new Window0()).start();
        new Thread(new Window0()).start();
    }
}
