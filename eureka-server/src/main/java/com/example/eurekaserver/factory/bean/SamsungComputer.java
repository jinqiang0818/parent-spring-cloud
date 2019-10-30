package com.example.eurekaserver.factory.bean;

public class SamsungComputer implements Computer {
    @Override
    public void work() {
        System.out.println("samsung computer is work");
    }
}
