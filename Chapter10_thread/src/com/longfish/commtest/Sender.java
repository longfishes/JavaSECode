package com.longfish.commtest;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Sender implements Runnable {
    int i = 1;
    Scanner sc = new Scanner(System.in);
    InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
    int port;


    Sender(int port) throws IOException {
        this.port = port;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Player.class) {
                System.out.println("----------" + i++ + " : 发送数据$$$$$----------");

                try {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    Socket socket = new Socket(inetAddress, port);


                    OutputStream os = socket.getOutputStream();
                    ObjectOutputStream oos = new ObjectOutputStream(os);

                    oos.writeObject(new Point(x, y));

                    oos.close();
                    socket.close();

                    Player.class.notify();
                    Player.class.wait();


                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
