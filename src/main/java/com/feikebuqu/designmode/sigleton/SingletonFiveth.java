package com.feikebuqu.designmode.sigleton;

/**
 * @author 飞客不去
 * 懒汉式优化
 */
public class SingletonFiveth {

    private  volatile static    SingletonFiveth singletonFiveth;

    private SingletonFiveth(){ }

    public static   SingletonFiveth getInstance(){
        if (singletonFiveth == null){
            synchronized(SingletonFiveth.class){
                if (singletonFiveth == null){
                    singletonFiveth = new SingletonFiveth();
                }
            }
        }


           return singletonFiveth;
    }
}
