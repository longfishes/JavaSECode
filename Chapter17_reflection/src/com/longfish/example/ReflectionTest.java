package com.longfish.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionTest {

    @Test
    public void test1() {
        Person p = new Person();
        System.out.println(p);
    }

    @Test
    public void test2() throws Exception {
        Person p = Person.class.newInstance();
        Person.class.getDeclaredField("name").set(p, "1145");
        Field f = Person.class.getDeclaredField("age");
        f.setAccessible(true);
        f.set(p, 1145);

        System.out.println(p);
    }

    @Test
    public void test3() throws Exception {
        Constructor<Person> c = Person.class.getDeclaredConstructor(String.class, Integer.class);
        c.setAccessible(true);
        Person p = c.newInstance("111", 22);

        System.out.println(p);
    }

    @Test
    public void test4() throws Exception {
        Constructor<Runtime> c = Runtime.class.getDeclaredConstructor();
        c.setAccessible(true);
        System.out.println(c.newInstance());
        

    }

}
