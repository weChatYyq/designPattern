/**
 * 单例模式(包说明类)
 * 单例模式，是一种常用的软件设计模式。在它的核心结构中只包含一个被称为单例的特殊类。
 * 通过单例模式可以保证系统中，应用该模式的类一个类只有一个实例。即一个类只有一个对象实例。
 * 特点：
 *  类构造器私有
 *  持有自己类型的属性
 *  对外提供获取实例的静态方法
 *
 * 主要有两种实现方式：懒汉式和饿汉式
 * 防止序列化、反射对单例的破坏
 * 防序列化破坏：
 *   引用：https://www.cnblogs.com/kexianting/p/8977990.html
 * 防 反射和Unsafe对象构造实例 破坏:
 *   在单例模式的设计过程中，我们说过很关键的一点是一定要将构造器设计为私有构造器，因为这样可以防止从外部构造对象。但是这样真的就会安全吗，答案肯定是不一定的。我们知道通过反射我们可以获取类中的域、方法、构造器，可以修改他们的访问权限，这样可以通过反射构造对象。
 *   引用：https://blog.csdn.net/Wenlong_L/article/details/82811996
 * 参考：
 *   https://www.jianshu.com/p/3bfd916f2bb2
 *   https://blog.csdn.net/itachi85/article/details/50510124
 *   https://www.cnblogs.com/cielosun/p/6596475.html
 */
package com.example.singleton;