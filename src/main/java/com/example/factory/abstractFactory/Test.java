package com.example.factory.abstractFactory;

import com.example.factory.common.Bullet;
import com.example.factory.common.Gun;

public class Test {
    public static void main(String[] args) {

        Factory factory;
        Gun gun;
        Bullet bullet;

        factory =new AKFactory();
        bullet=factory.produceBullet();
        bullet.load();
        gun=factory.produceGun();
        gun.shooting();

    }
}
