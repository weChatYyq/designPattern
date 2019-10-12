package com.example.builder;

public class Test {
    public static void main(String[] args) {
        house();
    }

    public static void house() {
        HouseDirector houseDirector = new HouseDirector();
        // 简装
        JianzhuangBuilder jianzhuangBuilder = new JianzhuangBuilder();
        System.out.println("我要简装");
        System.out.println(houseDirector.builder(jianzhuangBuilder));

        // 精装
        JingzhuangBuilder jingzhuangBuilder = new JingzhuangBuilder();
        System.out.println("我要精装");
        System.out.println(houseDirector.builder(jingzhuangBuilder));

    }
}

