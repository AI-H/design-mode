package com.feikebuqu.designmode.abstractFactory;

/**
 * 只实现生产油的方法，另外一个默认实现返回null;
 */
public class OilFactory extends AbstractFactory {
    @Override
    public Oil createOil(String name) {
        if ("Kerosene".equals(name)) {
            return new Kerosene();
        }else if ("LubricatingOil".equals(name)){
            return new LubricatingOil();
        }
        return null;
    }

    @Override
    public Car createCar() {
        return null;
    }
}
