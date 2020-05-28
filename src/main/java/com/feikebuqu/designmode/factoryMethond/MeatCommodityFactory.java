package com.feikebuqu.designmode.factoryMethond;

public class MeatCommodityFactory extends CommodityFactory{
    /**
     * 根据名称来获取肉类商品
     *
     * @param name
     * @return
     */
    @Override
    Commodity getComodityByName(String name) {
        Commodity commodity = null;
        if ("niurou".equals(name)){
            commodity =  new NiuRou();
        } else if ("zhurou".equals(name)) {
            commodity = new ZhuRou();
        }
        return commodity;
    }

}
