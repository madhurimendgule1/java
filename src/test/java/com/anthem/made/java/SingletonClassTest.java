package com.anthem.made.java;

/**
 * Created by AF11126 on 8/3/2018.
 */
public class SingletonClassTest {
    private static SingletonClassTest ourInstance = new SingletonClassTest();

    public static SingletonClassTest getInstance() {
        return ourInstance;
    }

    private SingletonClassTest() {
    }
}
