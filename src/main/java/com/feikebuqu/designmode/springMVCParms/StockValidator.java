package com.feikebuqu.designmode.springMVCParms;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Stock注解校验类
 */
public class StockValidator implements ConstraintValidator<Stock,Integer>{

    Stock stock;
    int min;
    @Override
    public void initialize(Stock stock) {
            this.stock =stock;
            this.min =stock.min();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if (integer == null) {
        return false;
        }
        return integer>min;
    }
}
