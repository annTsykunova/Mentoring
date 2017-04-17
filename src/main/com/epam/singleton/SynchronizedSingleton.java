package com.epam.singleton;

public class SynchronizedSingleton {

    private volatile static SynchronizedSingleton instance;
    private SynchronizedSingleton(){}

    //An implementation of double checked locking of com.com.epam.singleton.SynchronizedSingleton
    public static SynchronizedSingleton getInstance(){//2
        if(instance == null){
            synchronized (SynchronizedSingleton.class){
                if(instance == null){
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
