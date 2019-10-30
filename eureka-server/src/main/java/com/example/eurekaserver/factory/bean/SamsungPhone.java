package com.example.eurekaserver.factory.bean;

public class SamsungPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Samsung is calling");
    }
}
