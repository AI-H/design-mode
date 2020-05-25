package com.feikebuqu.designmode.sigleton;

/**
 * 单例模式
 */
public class SigletonFirst {
    //私有化构造方法
    private SigletonFirst(){}

    /**
     * 每次访问这个静态方法都会构造一个实例，这里的实现不是单例，非唯一
     * @return
     */
    public static  SigletonFirst getInstance(){
        return new SigletonFirst();
    }
}
