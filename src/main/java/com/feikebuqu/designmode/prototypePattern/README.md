# 设计模式（二）---原型模式

[toc]

## 原型设计模式是什么

1. 当创建给定类需要很大的代价，或者资源消耗的时候，通过复制已有对象的方式创建一个新对象
2. 通过给定一个基础类，从而在其基础上衍生出来具有其他功能的其他类也算是原型设计，例如以水为原型，加咖啡粉，茶叶，制造出来咖啡，绿茶等。
3. 特点在于通过“复制”一个已经存在的实例来返回新的实例,而不是新建实例

## 解决什么问题

1. 创造一个新对象或新实例，需要消耗很大的资源
2. 通过 new 产生一个对象需要非常繁琐的数据准备或访问权限
3. 需要创建一个值相同而名称不同的对象，或者是基于原型创建一个更高级的东西，比如神龙斗士中不同类型的神龙号，是基于一个原型创造出来新的
4. 一般原型模式不会单独使用，一般和工厂模式配合使用

## 使用以及实现

在java代码中的实现一般都是实现Cloneable接口，重写一下clone方法就行了，使用很简单

~~~java
**
 * 原型模式java实现
 * @author 飞客不去
 * 龙神号原型
 */
public class DragonGod implements Cloneable{

    /**
     * 重写clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone(){
        try {
            return (DragonGod)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

~~~

```java
/**
 * @author 飞客不去
 * 凤凰龙神号
 */
public class PhoenixDragonGod extends DragonGod {
    public void whoAmI() {
        System.out.println("凤凰龙神号！！");
    }
}
```

使用的话就是创建一个对象，在需要的时候，复制这个对象出来使用

```java
/**
 * @author 飞客不去
 * 召唤龙神号的人
 */
public class XiaoDu {


    public static void main(String[] args) {

        PhoenixDragonGod phoenixDragonGod = new PhoenixDragonGod();
        
        PhoenixDragonGod clone = (PhoenixDragonGod)phoenixDragonGod.clone();
        System.out.println("原型："+phoenixDragonGod);
        System.out.println("复制："+clone);
    }
}

```

打印结果：会发现两个地址值不一样

```java
原型：com.feikebuqu.designmode.prototypePattern.PhoenixDragonGod@49476842
复制：com.feikebuqu.designmode.prototypePattern.PhoenixDragonGod@78308db1
```



### 使用问题

1. 在使用过程中，有个奇怪的地方，在原型类实现类上加上@Data注解，复制出来的对象和原对象地址值一致，说明是同一个，而去掉@Data，会发现，两个地址值就不一样了
2. 深拷贝和浅拷贝，以上使用原型模式，创造新实例的时候，对对象的拷贝，属于浅拷贝，就是只会拷贝对象的基本数据类型属性，对于引用的属性值只是浅拷贝,也就是说，原型对象和克隆对象的引用属性的地址值是一样的。不过想要实现深拷贝也不难，只要在实现clone方法内部做深拷贝，并且，属性的引用类型，需实现克隆接口即可。
3. 原型模式深拷贝的只有 8种基本类型以及他们的封装类，和String类，其他都是浅拷贝，即只会拷贝地址值。
4. 原型模式一般与工厂模式配合使用，以便扩展新的功能，比如由一个统一的类，根据外部条件，返回不同类型的子类的原型复制。
5. 原型模式的使用场景和条件跟单例模式适用的场景和需求相反
### 代码地址
[原型模式](../prototypePattern)
