package com.example.eurekaserver.factoryAbstact;

import com.example.eurekaserver.factory.bean.Computer;
import com.example.eurekaserver.factory.bean.Phone;

public interface SysFactory {

    Phone createPhone();

    Computer createComputer();

}
