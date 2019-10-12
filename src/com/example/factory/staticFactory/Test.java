package com.example.factory.staticFactory;

import com.example.factory.common.Shape;

/**
 * 静态工厂测试类
 */
public class Test {

    public static void main(String[] args) {

        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
