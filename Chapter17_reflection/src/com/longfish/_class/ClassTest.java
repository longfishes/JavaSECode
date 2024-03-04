package com.longfish._class;

import com.longfish.example.Person;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassTest {
    @Test
    public void test1() throws ClassNotFoundException {
        Class<Person> clz = Person.class;
        System.out.println(clz);
        System.out.println(clz.getName());

        Person p = new Person();
        Class<? extends Person> clz2 = p.getClass();
        System.out.println(clz);

        Class<?> clz3 = Class.forName(Person.class.getName());
        System.out.println(clz);


        Class<?> clz4 = ClassLoader.getSystemClassLoader().loadClass(Person.class.getName());

        System.out.println((clz == clz2));
        System.out.println((clz2 == clz3));
        System.out.println((clz4 == clz));
    }

    @Test
    public void test2() {
        System.out.println(Void.class);


    }

    @Test
    public void test3() {
        Stream.of(1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10)
                .distinct()
                .filter(val -> val > 1)
                .skip(1)
                .limit(5)
                .forEach(System.out::println);
    }

    @Test
    public void test4() {
        Stream.of("jfksldjk","fjkd","ioerwjiorewio","","aaa")
                .filter(s -> s.length() >= 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    @Test
    public void test5() {
        List<Integer> list;
        list = Stream.of(1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10).sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
        System.out.println(list);

        Optional<Integer> optional = Optional.of(1);
        System.out.println(optional.get().getClass().getName() + ":" + optional.get());
    }

    public String md5(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] md5 = md.digest(data.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();
            for (byte b : md5) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Test
    public void test6() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str.append("jfdksljlkfd");
        }
        System.out.println(md5("Longfish123"));
        System.out.println(md5(str.toString()));
    }




}
