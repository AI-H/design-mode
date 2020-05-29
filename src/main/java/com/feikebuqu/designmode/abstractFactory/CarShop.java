package com.feikebuqu.designmode.abstractFactory;

public class CarShop {
    public static void main(String[] args) {
        AbstractFactory factory =new BikeFactory();
        factory.createCar();
        factory.createOil();
    }
}
