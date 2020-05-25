package com.feikebuqu.designmode.prototypePattern;

/**
 * 原型模式java实现
 * @author 飞客不去
 * 龙神号原型
 */
public class DragonGod implements Cloneable{


    /**
     * 重写clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone(){
        try {
            return (DragonGod)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }




}
