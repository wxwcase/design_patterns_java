package com.wxwcase.singleton_pattern.stat;

/**
 * Created by wwang on 12/23/2016.
 */
public class Singleton {

    // eagerly created singleton
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // other useful methods
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
