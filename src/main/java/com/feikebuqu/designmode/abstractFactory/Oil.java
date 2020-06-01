package com.feikebuqu.designmode.abstractFactory;

import lombok.Data;

/**
 * 油  可以是抽象类也可以是接口也可以是具体类
 */
@Data
public class Oil {
    private String name;
    private Double price;
    private Car   user;
}
