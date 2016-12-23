package com.wxwcase.singleton_pattern.classic;

/**
 * Created by wwang on 12/23/2016.
 */
public class SingletonClient {

    public static void main(String[] args) {

        Singleton singletonng = Singleton.getInstance();

        System.out.println(singletonng.getDescription());
    }
}
