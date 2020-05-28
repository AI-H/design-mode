package com.feikebuqu.designmode.springMVCParms;


import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
public class SpringController {


    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false ,defaultValue = "asasasasa") String hello) {
        return hello;
    }


    @PostMapping("/drink")
    public String addDrink(@Valid Drink drink, BindingResult result){
        //校验的结果
        System.out.println(result);
        return drink.getName();
    }

    @PostMapping("/food")
    public String addFood(@Valid Food food){

        return food.getDrink().getName();
    }

    @PostMapping("/updatedrink")
    public String updateDrink(@Validated(Drink.Add.class) Drink drink){

        return drink.getName();
    }
}
