package com.example.singleton.lazy;

import java.io.ObjectStreamException;

public class LazySingleton04 {
    private LazySingleton04(){
    }
    public static LazySingleton04 getInstance(){
        return SingletonHolder.sInstance;
    }
    private static class SingletonHolder {
        private static final LazySingleton04 sInstance = new LazySingleton04();
    }
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.sInstance;
    }
    public static void main(String[] args) {
        System.out.println(LazySingleton04.getInstance());
    }
}
