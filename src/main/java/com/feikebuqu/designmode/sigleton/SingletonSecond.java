package com.feikebuqu.designmode.sigleton;

/**
 * 饿汉式
 * @author 飞客不去
 */
public class SingletonSecond {

    private static SingletonSecond singletonSecond = new SingletonSecond();

    private SingletonSecond(){}



    private static SingletonSecond getInstance(){
        return singletonSecond;
    }
}
