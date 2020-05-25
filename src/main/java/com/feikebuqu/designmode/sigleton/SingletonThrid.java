package com.feikebuqu.designmode.sigleton;

/**
 * @author 飞客不去
 * 懒汉式
 */
public class SingletonThrid {

    private static SingletonThrid singletonThrid;

    private SingletonThrid(){ }

    public static SingletonThrid getInstance() {
        if (singletonThrid == null) {
            singletonThrid = new SingletonThrid();
        }

        return singletonThrid;
    }
}
