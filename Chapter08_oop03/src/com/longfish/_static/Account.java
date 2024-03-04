package com.longfish._static;

public class Account {
    private final int id;
    private static int init = 1001;

    public Account() {
        id = init;
        init ++;
    }

    public int getId() {
        return id;
    }

    public static void reset(){
        init = 1001;
    }
}
