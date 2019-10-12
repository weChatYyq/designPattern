package com.example.factory.staticFactory;

import com.example.factory.common.*;

/**
 * 静态工厂类
 */
public class ShapeFactory {
    // 使用 getShape 方法获取形状类型的对象
    public static Shape  getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
