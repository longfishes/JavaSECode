package com.longfish.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args){
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.1.1");
            InetAddress i4 = InetAddress.getByName("127.0.0.1");
            InetAddress i3 = InetAddress.getByName("baidu.com");//DNS解析baidu.com/42.121.6.2
            InetAddress i5 = InetAddress.getByName("youtube.com");//DNS解析youtube.com/42.121.6.2
            InetAddress i2 = InetAddress.getLocalHost();//本机ip地址DESKTOP-1S77V0G/192.168.1.6

            System.out.println(inetAddress);
            System.out.println(i3);
            System.out.println(i2);
            System.out.println(i4);
            System.out.println(i5);


            System.out.println(i5.getHostName());
            System.out.println(Arrays.toString(i4.getAddress()));


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
