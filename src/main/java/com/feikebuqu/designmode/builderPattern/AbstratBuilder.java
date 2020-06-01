package com.feikebuqu.designmode.builderPattern;

/**
 * 抽象的生成器接口
 */
public abstract class AbstratBuilder {


    public abstract void addCpu();
    public abstract void addMem();
    public abstract void addStorage();
    public abstract void addScreen();
    public abstract void buildNewComputer();
    public abstract Computer getComputer();
}
