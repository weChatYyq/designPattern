package com.example.factory.methodFactory;

import com.example.factory.common.Circle;
import com.example.factory.common.Shape;

/**
 * 圆形工厂类
 */
public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
