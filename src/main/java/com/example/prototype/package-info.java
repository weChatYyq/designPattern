/**
 * 原型模式(包说明类)
 * 定义：
 *   通过复制现有的对象实例来创建新的对象实例。
 * 实现
 *   stap 1：实现Cloneable接口
 *      Cloneable接口的作用是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
 *   stap 2: 重写Object类中的clone方法
 *      Java中，所有类的父类都是Object类，Object类中有一个clone方法，作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，因此，原型类需要将clone方法的作用域修改为public类型。
 *
 * 适用场景：
 * 1，复制对象的结构和数据。
 * 2，希望对目标对象的修改不影响既有的原型对象。
 * 3，创建一个对象的成本比较大。
 *
 *  优点：
 *  1，使用原型模型创建一个对象比直接new一个对象更有效率，因为它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
 *  2，隐藏了制造新实例的复杂性，使得创建对象就像我们在编辑文档时的复制粘贴一样简单。
 *
 *  缺点：
 *  1，由于使用原型模式复制对象时不会调用类的构造方法，所以原型模式无法和单例模式组合使用，因为原型类需要将clone方法的作用域修改为public类型，那么单例模式的条件就无法满足了。
 *  2，使用原型模式时不能有final对象。
 *  3，Object类的clone方法只会拷贝对象中的基本数据类型，对于数组，引用对象等只能另行拷贝。这里涉及到深拷贝和浅拷贝的概念。
 *
 *  深拷贝与浅拷贝：
 *  浅拷贝：
 *  将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的（这样不安全）。
 *
 *  深拷贝：
 *  将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
 */
package com.example.prototype;