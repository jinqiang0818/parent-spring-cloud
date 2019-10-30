package com.example.eurekaserver.factory.factoryMethod;

import com.example.eurekaserver.factory.bean.Phone;
import com.example.eurekaserver.factory.bean.SamsungPhone;

public class SamsungPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }
}
