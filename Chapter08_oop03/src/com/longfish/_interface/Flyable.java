package com.longfish._interface;

public interface Flyable {
    int MIN_SPEED = 0;              //public static final int MIN_SPEED = 0;
    int MAX_SPEED = 7900;           //public static final int MAX_SPEED = 7900;
    String unit = "m/s";            //同理

    void fly();                     //public abstract void fly();


}
