package com.feikebuqu.designmode.abstractFactory;

import lombok.Data;

/**
 * 车的总称  可以是抽象类也可以是接口也可以是具体类
 */
@Data
public class Car {
    private String name;
    private Integer wheelNumber;
    private String  brand;
    private Double price;
}
