package com.example.factory.methodFactory;

import com.example.factory.common.Rectangle;
import com.example.factory.common.Shape;

/**
 * 长方形工厂类
 */
public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
