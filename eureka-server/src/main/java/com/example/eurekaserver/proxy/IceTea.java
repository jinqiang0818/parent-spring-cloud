package com.example.eurekaserver.proxy;

public class IceTea implements Drink {
    @Override
    public void taste() {
        System.out.println("喝冰红茶");
    }
}
