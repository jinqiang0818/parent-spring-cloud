package com.example.eurekaserver.factoryAbstact;

public class FactoryAbstactMain {
    public static void main(String[] args) {
        SysFactory appleFactory = new AppleFactory();
        appleFactory.createPhone().call();
        appleFactory.createComputer().work();

        SysFactory samsungFactory = new SamsungFactory();
        samsungFactory.createPhone().call();
        samsungFactory.createComputer().work();
    }
}
