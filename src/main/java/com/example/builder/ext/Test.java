package com.example.builder.ext;

public class Test {
    public static void main(String[] args) {
        Student student = Student.builder().name("平头哥").num(1).age(18).email("平头哥@163.com").build();
        System.out.println(student);


        Student2 student2 = Student2.builder().name("平头哥").num(1).age(18).email("平头哥@163.com").build();
        System.out.println(student);
    }
}
