package com.feikebuqu.designmode.abstractFactory;

/**
 * 自行车相关制造工厂
 */
public class BikeFactory extends AbstractFactory{

    @Override
    public Oil createOil(String name) {
        return new LubricatingOil();
    }

    @Override
    public Car createCar() {
        return new Bike();
    }
}
