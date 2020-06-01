package com.feikebuqu.designmode.builderPattern;

/**
 * 具体的建造者
 */
public class IntelBuilder extends AbstratBuilder{

    private Computer computer;
    @Override
    public void addCpu() {
        computer.setCpu("I7-9750H");
    }

    @Override
    public void addMem() {
        computer.setMem("三星");

    }

    @Override
    public void addStorage() {
        computer.setStorage("SSD-1T");
    }

    @Override
    public void addScreen() {
        computer.setScreen("三星-oleds");
    }

    @Override
    public void buildNewComputer() {
        computer = new Computer();
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
