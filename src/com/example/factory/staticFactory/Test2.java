package com.example.factory.staticFactory;

import com.example.factory.common.Circle;
import com.example.factory.common.Rectangle;

/**
 * 利用反射优化简单(也叫静态)工厂测试类
 */
public class Test2 {
    public static void main(String[] args) {

        Circle circle = (Circle) ShapeFactory2.getClass(com.example.factory.common.Circle.class);
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeFactory2.getClass(com.example.factory.common.Rectangle.class);
        rectangle.draw();
    }
}
