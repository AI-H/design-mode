package com.feikebuqu.designmode.abstractFactory;

/**
 * 火车相关的建造工厂
 */
public class TrainFactory extends AbstractFactory {

    @Override
    public Oil createOil(String name) {
        return new Kerosene();
    }

    @Override
    public Car createCar() {
        return new Train();
    }
}
