package com.designpattern.creational.singleton;

public class Singleton {
    private static volatile Singleton instance = null;

    private static Object lock = new Object();

    private Singleton(){
        System.out.println("Private constructor called!");
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (lock) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
