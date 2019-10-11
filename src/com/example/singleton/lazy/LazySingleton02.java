package com.example.singleton.lazy;
/**
 * 单例模式——懒汉式
 * 适用于多线程环境(synchronized方法加锁)，但效率不高
 */
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
