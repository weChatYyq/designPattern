package com.example.factory.methodFactory;

import com.example.factory.common.Shape;

public class Test {
    public static void main(String[] args) {
        Factory circlefactory = new CircleFactory();
        Shape circle = circlefactory.getShape();
        circle.draw();

        Factory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.getShape();
        rectangle.draw();
    }
}
