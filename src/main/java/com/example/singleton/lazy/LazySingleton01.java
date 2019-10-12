package com.example.singleton.lazy;

/**
 * 单例模式——懒汉式
 * 适用于单线程环境
 */
public class LazySingleton01 {
    private static LazySingleton01 singleton;
    private LazySingleton01(){}

    public static LazySingleton01 getInstance(){
        if(singleton==null){
            singleton = new LazySingleton01();
        }
        return singleton;
    }
    public static void main(String[] args) {
        System.out.println(LazySingleton01.getInstance());
    }
}
