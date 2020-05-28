package com.feikebuqu.designmode.factoryMethond;

/**
 * 红牛 具体的商品
 * @author 飞客不去
 */
public class HongNiu extends Commodity {


    public HongNiu (){
        this.setName("红牛");
        this.setPrice(6.5);
    }

    @Override
    public String dabao() {
        return "易拉罐";
    }
}
