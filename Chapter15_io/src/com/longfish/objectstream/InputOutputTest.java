package com.longfish.objectstream;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputTest {
    @Test
    public void test1() throws IOException {
        File file = new File("objMemory.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        List<Integer> obj = new ArrayList<>();
        obj.add(114514);
        obj.add(114514);

        oos.writeObject(obj);//序列化
        oos.writeUTF("jfkldsjklfd");

        oos.close();
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        File file = new File("objMemory.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Object obj = ois.readObject();//反序列化

        ArrayList<Integer> list = (ArrayList) obj;
        System.out.println(list);

        System.out.println(ois.readUTF());

        ois.close();
    }

    @Test
    public void test3() throws IOException, ClassNotFoundException {
        Person p1 = new Person("longfish",114514);
        File file = new File("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        oos.writeObject(p1);
        Person p = (Person) ois.readObject();

        System.out.println(p);

        oos.close();
        ois.close();
    }
}
