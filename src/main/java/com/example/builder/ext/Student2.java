package com.example.builder.ext;

public class Student2 {

    private String name;

    private int age;

    private int num;

    private String email;

    // 提供一个静态builder方法
    public static Student2.Builder builder() {
        return new Student2.Builder();
    }
    // 外部调用builder类的属性接口进行设值。
    public static class Builder{
        private String name;

        private int age;

        private int num;

        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder num(int num) {
            this.num = num;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Student2 build() {
            // 将builder对象传入到学生构造函数
            return new Student2(this);
        }
    }
    // 私有化构造器
    private Student2(Builder builder) {
        name = builder.name;
        age = builder.age;
        num = builder.num;
        email = builder.email;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                ", email='" + email + '\'' +
                '}';
    }
}

