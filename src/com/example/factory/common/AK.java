package com.example.factory.common;

/**
 * AK(枪)
 */
public class AK implements Gun {
    @Override
    public void shooting() {
        System.out.println("shooting with AK");
    }
}
