package com.feikebuqu.designmode.abstractFactory;

import lombok.Data;

/**
 * 车的总称
 */
@Data
public class Car {
    private String name;
    private Integer wheelNumber;
    private String  brand;
    private Double price;
}
