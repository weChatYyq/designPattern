package com.example.adapter;

public class ClassAdapter extends Adaptee implements Target {
    public void request() {
        super.specificRequest();
    }
}
