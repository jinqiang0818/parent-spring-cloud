package com.example.eurekaserver.factoryAbstact;

import com.example.eurekaserver.factory.bean.AppleComputer;
import com.example.eurekaserver.factory.bean.ApplePhone;
import com.example.eurekaserver.factory.bean.Computer;
import com.example.eurekaserver.factory.bean.Phone;

public class AppleFactory implements SysFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }
}
