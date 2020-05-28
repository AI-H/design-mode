package com.feikebuqu.designmode.factoryMethond;

/**
 * 绿茶
 * @author 飞客不去
 */
public class LvCha extends Commodity {

    public LvCha (){
        this.setName("绿茶");
        this.setPrice(3.5);
    }

    @Override
    public String dabao() {
        return "塑料瓶";
    }
}
