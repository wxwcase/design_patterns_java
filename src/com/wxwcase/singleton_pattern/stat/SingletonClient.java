package com.wxwcase.singleton_pattern.stat;

/**
 * Created by wwang on 12/23/2016.
 */
public class SingletonClient {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.getDescription());
    }
}