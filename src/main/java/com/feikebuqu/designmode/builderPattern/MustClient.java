package com.feikebuqu.designmode.builderPattern;

/**
 * 交给别人组装
 */
public class MustClient {

    public static void main(String[] args) {
        MustBuilder mustBuilder = new MustBuilder(new IntelBuilder());
        mustBuilder.bulidComputer();
        Computer computer = mustBuilder.getComputer();
    }
}
