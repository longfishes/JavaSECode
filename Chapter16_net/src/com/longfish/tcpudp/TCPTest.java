package com.longfish.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TCPTest {
    @Test
    public void client() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);

            Socket socket = null;
            OutputStream os = null;
            OutputStreamWriter osw = null;
            try {
                InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
                int port = 1145;
                socket = new Socket(inetAddress, port);


                os = socket.getOutputStream();
                osw = new OutputStreamWriter(os);
                Thread.sleep(1000);
                osw.write("i am your father 我是你爸");
//            osw.write("");


            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                assert osw != null;
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void sever() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

        Socket socket = null;
        InputStream is = null;
        InputStreamReader isr = null;
        try {
            int port = 1145;
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("IP\t\t\t日期\t\t\t\t\t详情");
            while (true) {

                socket = serverSocket.accept();

                is = socket.getInputStream();
                isr = new InputStreamReader(is);
                System.out.print(socket.getInetAddress().getHostAddress() + " " +
                        dateFormat.format(System.currentTimeMillis()) + " ");
                int data = isr.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = isr.read();
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert socket != null;
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert isr != null;
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
