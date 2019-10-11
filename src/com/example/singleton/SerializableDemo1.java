package com.example.singleton;

import com.example.singleton.lazy.LazySingleton03;

import java.io.*;

public class SerializableDemo1 {
    //为了便于理解，忽略关闭流操作及删除文件操作。真正编码时千万不要忘记
    //Exception直接抛出
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(LazySingleton03.getInstance());
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        LazySingleton03 newInstance = (LazySingleton03) ois.readObject();
        //判断是否是同一个对象
        System.out.println(newInstance == LazySingleton03.getInstance());
//     输出结构为false，
//       说明：通过对Singleton的序列化与反序列化得到的对象是一个新的对象，这就破坏了Singleton的单例性。
//       原因：序列化会通过反射调用无参数的构造方法创建一个新的对象。(源码：java.io.ObjectInputStream.readOrdinaryObject方法里面某行代码 obj = desc.isInstantiable() ? desc.newInstance() : null;  desc.newInstance：该方法通过反射的方式调用无参构造方法新建一个对象。)
//       解决办法：只要在Singleton类中定义readResolve就可以解决该问题：(源码：java.io.ObjectInputStream.readOrdinaryObject方法 hasReadResolveMethod:如果实现了serializable 或者 externalizable接口的类中包含readResolve则返回true
//               invokeReadResolve:通过反射的方式调用要被反序列化的类的readResolve方法。
//               所以，原理也就清楚了，主要在Singleton中定义readResolve方法，并在该方法中指定要返回的对象的生成策略，就可以防止单例被破坏。)
    }
}
