package com.longfish.commtest;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver implements Runnable{
    int i = 1;
    int port;
    ServerSocket serverSocket;

    Receiver(int port) throws IOException {
        this.port = port;
        serverSocket = new ServerSocket(port);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Player.class) {

                try {

                    System.out.println("----------" + i++ + " : 接收数据----------");

                    Socket socket = serverSocket.accept();
                    System.out.print("接收到数据: ");

                    InputStream is = socket.getInputStream();
                    ObjectInputStream ois = new ObjectInputStream(is);

                    Point o = (Point) ois.readObject();

                    System.out.println(o);

                    ois.close();

                    Player.class.notify();
                    Player.class.wait();


                } catch (InterruptedException | IOException | ClassNotFoundException e) {
                    e.printStackTrace();


                }
            }
        }
    }
}
