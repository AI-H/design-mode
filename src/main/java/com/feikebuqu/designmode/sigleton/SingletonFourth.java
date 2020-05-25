package com.feikebuqu.designmode.sigleton;

/**
 * @author 飞客不去
 * 懒汉式，多线程
 */
public class SingletonFourth {


    private static SingletonFourth singletonFourth;

    private SingletonFourth(){ }

    public static synchronized  SingletonFourth getInstance(){
        if (singletonFourth == null){
            singletonFourth = new SingletonFourth();
        }

       return singletonFourth;
    }
}
