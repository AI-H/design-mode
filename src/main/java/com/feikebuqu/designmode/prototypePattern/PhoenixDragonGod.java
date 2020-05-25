package com.feikebuqu.designmode.prototypePattern;




import java.time.Instant;


/**
 * @author 飞客不去
 * 凤凰龙神号
 */
public class PhoenixDragonGod extends DragonGod {


    private String name;
    private Instant createTime;
    private Integer chang;
    private int high;
//    private Map map;
    private Luren luren;

    public void whoAmI() {
        System.out.println("凤凰龙神号！！");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Integer getChang() {
        return chang;
    }

    public void setChang(Integer chang) {
        this.chang = chang;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Luren getLuren() {
        return luren;
    }

    public void setLuren(Luren luren) {
        this.luren = luren;
    }

  
  
  
  
  
  
  
  
  
  
}
