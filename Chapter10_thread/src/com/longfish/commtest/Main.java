package com.longfish.commtest;

import com.longfish.commtest.waittingroom.Bean;
import com.longfish.commtest.waittingroom.Server;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Main view = new Main();
        view.enterMainMenu();

    }

    public void enterMainMenu() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("创建还是加入？（1创建 2加入）");
            int flag = sc.nextInt();


            if (flag == 1) {
                int self;
                Bean bean;

                try {
                    System.out.print("请输入房间号: ");
                    self = sc.nextInt();
                    System.out.print("请输入房间信息: ");
                    String data = sc.next();

                    System.out.println("已创建");
                    bean = new Server(self, data).start();

                } catch (Exception e) {
                    System.out.println("房间已存在");
                    continue;
                }


                Player p = new Player(self, bean.getPort());
                System.out.println("对手传来的信息: " + bean.getData());


                new Thread(p.sender).start();
                Thread.sleep(10);
                new Thread(p.receiver).start();
                break;


            } else {
                System.out.print("请输入房间号: ");
                int oppo = sc.nextInt();
                System.out.print("请输入自己的信息: ");
                String message = sc.next();

                try {
                    Socket socket = new Socket("localhost", oppo);
                    int self = socket.getLocalPort();

                    OutputStream os = socket.getOutputStream();
                    ObjectOutputStream oos = new ObjectOutputStream(os);
                    oos.writeObject(message);


                    InputStream is = socket.getInputStream();
                    ObjectInputStream ois = new ObjectInputStream(is);
                    Object info = ois.readObject();
                    System.out.println("对方传来的房间信息: " + info);


                    oos.close();
                    ois.close();
                    socket.close();

                    Player p = new Player(self, oppo);
                    System.out.println("房间已开启");

                    new Thread(p.receiver).start();
                    Thread.sleep(10);
                    new Thread(p.sender).start();
                    break;


                } catch (ConnectException e) {
                    System.out.println("房间不存在");
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        }
    }


}
