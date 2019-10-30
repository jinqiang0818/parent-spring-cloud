package com.example.eurekaserver.factory.factoryMethod;

import com.example.eurekaserver.factory.bean.ApplePhone;
import com.example.eurekaserver.factory.bean.Phone;

public class ApplePhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
