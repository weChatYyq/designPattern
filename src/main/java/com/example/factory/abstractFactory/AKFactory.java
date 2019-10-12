package com.example.factory.abstractFactory;

import com.example.factory.common.AK;
import com.example.factory.common.AKBullet;
import com.example.factory.common.Bullet;
import com.example.factory.common.Gun;

/**
 * 创建具体工厂
 * 生产AK和AK子弹的工厂
 */
public class AKFactory implements Factory {
    @Override
    public Bullet produceBullet() {
        return new AKBullet();
    }

    @Override
    public Gun produceGun() {
        return new AK();
    }
}
