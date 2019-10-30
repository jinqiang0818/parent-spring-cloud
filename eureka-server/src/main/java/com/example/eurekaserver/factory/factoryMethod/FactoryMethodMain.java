package com.example.eurekaserver.factory.factoryMethod;

import com.example.eurekaserver.factory.bean.Phone;

public class FactoryMethodMain {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new ApplePhoneFactory();
        Phone applePhone = phoneFactory.createPhone();
        applePhone.call();


    }
}
