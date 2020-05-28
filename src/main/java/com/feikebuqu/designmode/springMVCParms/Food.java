package com.feikebuqu.designmode.springMVCParms;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author 飞客不去
 */
@Data
public class Food {

    @Valid
    private Drink drink;
    @NotNull
    private String type;

    @Stock
    private int  number;
}
