package com.example.builder;

/**
 * 简装创建者（ConcreteBuilder 具体建造者）
 */
public class JianzhuangBuilder implements HouseBuilder {

    private House house = new House();

    public void doJiadian() {
        house.setJiadian("简单家电就好");
    }

    public void doDiBan() {
        house.setDiban("普通地板");
    }

    public void doYouqi() {
        house.setYouqi("污染较小的油漆就行");
    }

    public House getHouse() {
        return house;
    }
}

