package com.feikebuqu.designmode.prototypePattern;

import java.time.Instant;
import java.util.HashMap;

/**
 * @author 飞客不去
 * 召唤龙神号的人
 */
public class XiaoDu {


    public static void main(String[] args) {

        Luren luren = new Luren();
        luren.setName("路人甲");
        luren.setAge(18);


        PhoenixDragonGod phoenixDragonGod = new PhoenixDragonGod();
        phoenixDragonGod.setLuren(luren);
        phoenixDragonGod.setCreateTime(Instant.now());
        phoenixDragonGod.setHigh(12);
        phoenixDragonGod.setChang(15);
        phoenixDragonGod.setName("凤凰龙神号");


        PhoenixDragonGod clone = (PhoenixDragonGod)phoenixDragonGod.clone();
        System.out.println("原型："+phoenixDragonGod.getLuren());
        System.out.println("复制："+clone.getLuren());

        System.out.println("原型："+phoenixDragonGod);
        System.out.println("复制："+clone);

        System.out.println("原型："+phoenixDragonGod.getLuren().getAge());
        System.out.println("复制："+clone.getLuren().getAge());


        Luren luren1 = phoenixDragonGod.getLuren();
        luren1.setAge(20);

        System.out.println("原型："+phoenixDragonGod.getLuren().getAge());
        System.out.println("复制："+clone.getLuren().getAge());

    }
}
