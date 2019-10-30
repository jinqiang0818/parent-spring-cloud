package com.example.eurekaserver.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DrinkHandler implements InvocationHandler {

    private IceTea iceTea;

    public DrinkHandler(IceTea iceTea) {
        this.iceTea = iceTea;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(iceTea, args);
    }

    public static void main(String[] args) {
        IceTea iceTea = new IceTea();
        DrinkHandler drinkHandler = new DrinkHandler(iceTea);
        Drink drink = (Drink) Proxy.newProxyInstance(iceTea.getClass().getClassLoader(),iceTea.getClass().getInterfaces(),drinkHandler);
        drink.taste();
    }
}
