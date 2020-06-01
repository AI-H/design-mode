package com.feikebuqu.designmode.builderPattern;

/**
 * 固定的建造商，类似于你买了电脑组件后，交给别人去实际组装，步骤对使用者不可见
 */
public class MustBuilder {

    private AbstratBuilder builder;

    public MustBuilder(AbstratBuilder builder){
        this.builder = builder;
    }

    public void bulidComputer(){
        builder.addStorage();
        builder.addScreen();
        builder.addMem();
        builder.addCpu();
    }

    public Computer getComputer() {
        return builder.getComputer();
    }
}
