package com.example.factory.common;

/**
 * AK子弹类
 */
public class AKBullet implements Bullet {

    @Override
    public void load() {
        System.out.println(" Load bullets with AK");
    }
}
