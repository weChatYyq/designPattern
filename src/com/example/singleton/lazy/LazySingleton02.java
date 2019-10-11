package com.example.singleton.lazy;

public class LazySingleton02 {
    private static LazySingleton02 singleton;
    private LazySingleton02(){}

    public static synchronized  LazySingleton02 getInstance(){
        if(singleton==null){
            singleton = new LazySingleton02();
        }
        return singleton;
    }
    public static void main(String[] args) {
        System.out.println(LazySingleton02.getInstance());
    }
}
