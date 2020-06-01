package com.feikebuqu.designmode.builderPattern;

/**
 * 具体建造者-AMD
 */
public class AMDBuilder extends AbstratBuilder{
    private Computer computer;

    @Override
    public void addCpu() {
        computer.setCpu("AMD-R7-3800X");
    }

    @Override
    public void addMem() {
        computer.setMem("海盗船");
    }

    @Override
    public void addStorage() {
        computer.setStorage("westdata-ssg-550g");
    }

    @Override
    public void addScreen() {
        computer.setScreen("acer-23");
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
