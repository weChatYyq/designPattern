package com.example.builder;

/**
 * 家装对象类（Product 产品角色）
 */
public class House {
    // 买家电
    private String jiadian;

    // 买地板
    private String diban;
    // 买油漆
    private String youqi;

    public String getJiadian() {
        return jiadian;
    }

    public void setJiadian(String jiadian) {
        this.jiadian = jiadian;
    }

    public String getDiban() {
        return diban;
    }

    public void setDiban(String diban) {
        this.diban = diban;
    }

    public String getYouqi() {
        return youqi;
    }

    public void setYouqi(String youqi) {
        this.youqi = youqi;
    }

    @Override
    public String toString() {
        return "House{" +
                "jiadian='" + jiadian + '\'' +
                ", diban='" + diban + '\'' +
                ", youqi='" + youqi + '\'' +
                '}';
    }
}

