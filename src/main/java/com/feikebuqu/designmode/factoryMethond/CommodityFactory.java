package com.feikebuqu.designmode.factoryMethond;

/**
 * 商品工厂
 * @author 飞客不去
 */
public abstract  class CommodityFactory {


    /**
     * 根据名称来获取商品
     * @param name
     * @return
     */
    abstract Commodity getComodityByName(String name);

}
