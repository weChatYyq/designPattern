package com.example.factory.common;

/**
 * M4A1子弹类
 */
public class M4A1Bullet implements Bullet {
    @Override
    public void load() {
        System.out.println("Load bullets with M4A1");
    }
}
