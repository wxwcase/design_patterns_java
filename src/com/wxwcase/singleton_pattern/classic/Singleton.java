package com.wxwcase.singleton_pattern.classic;

/**
 * Created by wwang on 12/23/2016.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton () {}

    public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
