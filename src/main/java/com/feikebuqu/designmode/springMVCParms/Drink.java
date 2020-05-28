package com.feikebuqu.designmode.springMVCParms;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author 飞客不去
 */
@Data
public class Drink {
    public interface Update{}
    public interface Add{}


    @NotNull(groups = {Update.class,Add.class})
    private String name;

    @Size(min = 1,max = 10000,groups = {Add.class})
    @NotNull(groups = {Update.class})
    private String describ;

    @Digits(integer = 2,fraction = 2)
    private Double price;
}
