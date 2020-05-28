package com.feikebuqu.designmode.factoryMethond;

/**
 * 超市
 * @author 飞客不去
 */
public class SuperMarket {


    private CommodityFactory commodityFactory;

    public SuperMarket (CommodityFactory commodityFactory) {
        this.commodityFactory = commodityFactory;
    }

    public Commodity sellCommodity(String name){

        Commodity commodity = commodityFactory.getComodityByName(name);
        System.out.println(commodity.dabao());
        return commodity;

    }

    public static void main(String[] args) {
        CommodityFactory drinkCommodityFactory = new DrinkCommodityFactory();
        Commodity hongniu = drinkCommodityFactory.getComodityByName("hongniu");
        hongniu.dabao();
    }




}
