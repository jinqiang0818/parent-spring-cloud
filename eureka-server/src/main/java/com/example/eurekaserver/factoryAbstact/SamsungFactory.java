package com.example.eurekaserver.factoryAbstact;

import com.example.eurekaserver.factory.bean.Computer;
import com.example.eurekaserver.factory.bean.Phone;
import com.example.eurekaserver.factory.bean.SamsungComputer;
import com.example.eurekaserver.factory.bean.SamsungPhone;

public class SamsungFactory implements SysFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Computer createComputer() {
        return new SamsungComputer();
    }
}
