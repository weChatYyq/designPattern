/**
 * Builder模式(包说明类)
 * 1、定义：
 *  Builder 模式中文叫作建造者模式，又叫生成器模式，它属于对象创建型模式，
 *  是将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *  建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，
 *  用户不需要知道内部的具体构建细节
 *
 *  2、角色
 *  Product：产品角色
 *  Builder：抽象建造者，定义产品接口
 *  ConcreteBuilder：具体建造者，实现Builder定义的接口，并且返回组装好的产品
 *  Director：指挥者，属于这里面的老大，你需要生产什么产品都直接找它。
 *
 *  3、应用举例：
 *  家装
 *  家装不管是精装还是简装，它的流程都相对固定，所以它适用于建造者模式。
 *
 *  4、变种builder
 *    在日常开发中，你是不是会经常看到下面这种代码:
 *  return new Docket(DocumentationType.SWAGGER_2)
 *  .apiInfo(apiInfo())
 *  .select()
 *  .apis(RequestHandlerSelectors.basePackage("com.curry.springbootswagger.controller"))
 *  .paths(PathSelectors.any())
 *  .build();
 *   是不是很优美？学会了 Builder 模式之后，你也可以通过这种方式进行对象构建。它是通过变种的 Builder 模式实现的。先不解释了，
 *   我们先用 Builder 模式来实现跟上述的对象构建，使用学生类为例。{@link com.example.builder.ext.Student2}
 *
 *  可以看到，变种 Builder 模式包括以下内容：
 *    在要构建的类内部创建一个静态内部类 Builder
 *    静态内部类的参数与构建类一致
 *    构建类的构造参数是 静态内部类，使用静态内部类的变量一一赋值给构建类
 *    静态内部类提供参数的 setter 方法，并且返回值是当前 Builder 对象
 *    最终提供一个 build 方法构建一个构建类的对象，参数是当前 Builder 对象
 *
 *  可能你会说，这种写法实现太麻烦了，确实需要我们写很多额外的代码，
 *  好在前辈们已经开发出了lombok来拯救我们，我们只需要引入lombok插件，
 *  然后在实体类上添加@Builder注解，你就可以实用 Builder 模式构建对象了。{@link com.example.builder.ext.Student}
 *
 * 5、优点
 * 在建造者模式中， 客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象
 * 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者， 用户使用不同的具体建造者即可得到不同的产品对象
 * 可以更加精细地控制产品的创建过程 。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程
 * 增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合“开闭原则”
 *
 * 6、缺点
 * 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
 * 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大。
 *
 * 参考引用：
 * https://juejin.im/post/5d6cd108f265da03a653313f
 */
package com.example.builder;