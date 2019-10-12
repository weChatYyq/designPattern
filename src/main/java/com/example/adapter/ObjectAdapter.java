package com.example.adapter;

public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter (Adaptee adaptee) {
        this.adaptee= adaptee;
    }

    public void request() {
        this.adaptee.specificRequest();
    }
}
