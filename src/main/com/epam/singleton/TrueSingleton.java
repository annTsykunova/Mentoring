package com.epam.singleton;

public class TrueSingleton {
    public static class SingletonHolder {
        private static final TrueSingleton HOLDER_INSTANCE = new TrueSingleton();
        private SingletonHolder(){}
    }

    public static TrueSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private TrueSingleton(){}
}

