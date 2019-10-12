package com.example.factory.staticFactory;

import com.example.factory.common.Shape;

/**
 *  利用反射优化简单(也叫静态)工厂类
 *
 *  这种方式的虽然符合了 开放-关闭原则 ，但是每一次传入的都是产品类的全部路径，这样比较麻烦。
 *  如果需要改善的话可以通过 反射+配置文件 的形式来改善，这种方式使用的也是比较多的。
 */
public class ShapeFactory2 {
    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
