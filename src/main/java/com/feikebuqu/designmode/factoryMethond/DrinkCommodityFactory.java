package com.feikebuqu.designmode.factoryMethond;

/**
 * @author 飞客不去
 * 子类工厂，加盟商
 */
public class DrinkCommodityFactory extends CommodityFactory{
    /**
     * 根据名称来获取饮料商品
     *
     * @param name
     * @return
     */
    @Override
    Commodity getComodityByName(String name) {
        Commodity commodity = null;
        if ("hongniu".equals(name)){
            commodity =  new HongNiu();
        } else if ("lvcha".equals(name)) {
            commodity = new LvCha();
        }
        return commodity;
    }

}
