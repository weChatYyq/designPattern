package com.example.singleton.lazy;

public class LazySingleton03 {
    private volatile static LazySingleton03 instance;
    private LazySingleton03 (){
    }
    public static LazySingleton03 getInstance() {
        if (instance== null) {
            synchronized (LazySingleton03.class) {
                if (instance== null) {
                    instance= new LazySingleton03();
                }
            }
        }
        return instance;
    } 
    public static void main(String[] args) {
        System.out.println(LazySingleton03.getInstance());
    }
}
