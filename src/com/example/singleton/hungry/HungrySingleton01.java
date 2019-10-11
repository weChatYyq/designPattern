package com.example.singleton.hungry;

public class HungrySingleton01 {
    private static HungrySingleton01 singleton = new HungrySingleton01();
    private HungrySingleton01(){}
    public static HungrySingleton01 getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(HungrySingleton01.getInstance());
    }
}
