package com.example.eurekaserver.factory.bean;

public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("apple is calling");
    }
}
