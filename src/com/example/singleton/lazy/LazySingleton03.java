package com.example.singleton.lazy;

import java.io.Serializable;

/**
 * 单例模式——懒汉式
 * 双重检查加锁（推荐）
 * 1、volatile 禁止指令重排
 * 2、synchronized对代码块加锁
 */
public class LazySingleton03 implements Serializable {
    private volatile static LazySingleton03 instance;
    private LazySingleton03 (){
    }
    public static LazySingleton03 getInstance() {
        // 先判断实例是否存在，若不存在再对类对象进行加锁处理
        if (instance== null) {
            synchronized (LazySingleton03.class) {
//              由于instance=new LazySingleton03()对象的创建在JVM中可能会进行重排序，在多线程访问下存在风险，使用volatile修饰signleton实例变量有效，解决该问题。
                if (instance== null) {
                    instance= new LazySingleton03();
                }
            }
        }
        return instance;
    }
//  注释该方法，SerializableDemo1输出为false,打开注释，SerializableDemo1输出为true
    private Object readResolve() {
        return instance;
    }
    public static void main(String[] args) {
        System.out.println(LazySingleton03.getInstance());
    }
}
