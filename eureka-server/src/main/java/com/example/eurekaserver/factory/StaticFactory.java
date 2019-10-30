package com.example.eurekaserver.factory;

import com.example.eurekaserver.factory.bean.ApplePhone;
import com.example.eurekaserver.factory.bean.Phone;
import com.example.eurekaserver.factory.bean.SamsungPhone;

public class StaticFactory {
    public static Phone createPhone(String name){
        if ("apple".equals(name)){
            return new ApplePhone();
        }else if ("Samsung".equals(name)){
            return new SamsungPhone();
        }else {
            return new SamsungPhone();
        }
    }

    public static void main(String[] args) {
        StaticFactory.createPhone("apple").call();
    }
}
