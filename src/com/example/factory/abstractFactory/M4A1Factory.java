package com.example.factory.abstractFactory;

import com.example.factory.common.*;

/**
 * 创建具体工厂
 * 生产M4A1和M4A1子弹的工厂
 */
public class M4A1Factory implements Factory {
    @Override
    public Bullet produceBullet() {
        return new M4A1Bullet();
    }

    @Override
    public Gun produceGun() {
        return new M4A1();
    }
}
