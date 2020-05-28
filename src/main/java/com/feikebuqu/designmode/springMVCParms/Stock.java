package com.feikebuqu.designmode.springMVCParms;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义校验注解
 */
@Target({ElementType.METHOD, ElementType.FIELD,  ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {StockValidator.class})
public @interface Stock {

    String message() default "库存不能低于{min}个";
    int min() default 4;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
