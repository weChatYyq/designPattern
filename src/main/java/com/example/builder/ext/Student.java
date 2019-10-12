package com.example.builder.ext;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
    private String name;

    private int age;

    private int num;

    private String email;

}
