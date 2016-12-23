package com.wxwcase.singleton_pattern.threadsafe;

/**
 * Created by wwang on 12/23/2016.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    // other useful methods
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
