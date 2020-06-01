package com.feikebuqu.designmode.builderPattern;

/**
 * 使用客户
 */
public class Client {

    public static void main(String[] args) {
        AbstratBuilder builder = new IntelBuilder();
        builder.buildNewComputer();
        builder.addCpu();
        builder.addMem();
        builder.addScreen();
        builder.addStorage();
        Computer computer = builder.getComputer();
    }
}
