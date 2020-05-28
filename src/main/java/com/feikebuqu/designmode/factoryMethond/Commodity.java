package com.feikebuqu.designmode.factoryMethond;

/**
 * 商品
 * @author 飞客不去
 */
public abstract class Commodity {

    private String name;
    private Double price;

    public String dabao(){
        return "塑料袋";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
