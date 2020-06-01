package com.feikebuqu.designmode.abstractFactory;

import com.feikebuqu.designmode.factoryMethond.Commodity;

/**
 * 抽象工厂  可以是抽象类也可以是接口
 */
public abstract class AbstractFactory {

    public abstract Oil createOil(String name);

    public abstract Car createCar();
}
