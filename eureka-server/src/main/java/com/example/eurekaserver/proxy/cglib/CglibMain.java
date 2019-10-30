package com.example.eurekaserver.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibMain {

    public static void main(String[] args) {
//        CglibProxy proxy = new CglibProxy();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Coffee.class);
//        enhancer.setCallback(proxy);
//        Coffee coffee = (Coffee) enhancer.create();
//        coffee.taste();


        Coffee coffee = (Coffee) CglibProxy.getInstance().getProxy(Coffee.class);
        coffee.taste();
    }
}
