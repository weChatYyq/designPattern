package com.example.builder;

/**
 * 精装创建者（ConcreteBuilder 具体建造者）
 */
public class JingzhuangBuilder implements HouseBuilder {

    private House house = new House();

    public void doJiadian() {
        house.setJiadian("二话不说，最好的");
    }

    public void doDiBan() {
        house.setDiban("二话不说，实木地板");
    }

    public void doYouqi() {
        house.setYouqi("二话不说，给我来0污染的");
    }

    public House getHouse() {
        return house;
    }
}


