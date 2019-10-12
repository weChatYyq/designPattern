package com.example.factory.abstractFactory;

import com.example.factory.common.Bullet;
import com.example.factory.common.Gun;

/**
 * 抽象工厂
 */
public interface Factory {
    public Bullet produceBullet();
    public Gun produceGun();
}
