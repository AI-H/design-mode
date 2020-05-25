# 单例设计模式
[toc]

* [优化或者其他形式](#优化或者其他形式)

## 单例模式是什么
单例模式：确保一个类只有一个实例，并提供一个全局访问点
## 解决什么问题
1. 有时候我们需要某些只需要一个的对象，比如线程池，缓存，驱动，我们要保证这些对象永远只有一个
2. 保证对象只有一个，且占用资源少，在使用的时候才获取此对象，全局变量也可以做都保证对象唯一，但是需要在程序在一开始就创建好对象，如果比较小哈资源就比较浪费
## 如何使用
1. 实现一个单例模式，需要两个条件即可
    1. 私有化构造器
    2. 提供一个全局访问点，获取这个类的唯一实例
    3. 错误示例：
```java
public class Singleton{
  
    private Singleton(){ }
    
    public static Singleton getInstance(){
    //每次访问这个静态方法都会构造一个实例，这里的实现不是单例，非唯一
        return  new Singleton();;
    }
}

```
    4. 所以单例的设计，应该是要保证构造器永远只构造一个对象，所以就需要有一个变量来作为该对象的引用，单例就需要在类的内部有一个静态变量引用这个唯一实例
2. 饿汉式，在程序一开始就给与这个对象，消耗资源比较大，不会有多线程问题，相当于急切的创建对象，所以称为饿汉式
```java
public class Singleton{
//饿汉式，在程序一开始就会创建一个实例对象，如果该对象占用资源比较大，并且也不一定就肯定会用，就会造成不必要的资源浪费，因为一开始就创建了对象，所以不会有多线程问题
    private static Singleton singleton = new Singleton();
    
    private Singleton(){ }
    
    public static Singleton getInstance(){
        return  singleton;
    }
}

```
3. 懒汉式，在需要的时候才去创建对象，如果对象已经创建过，那就返回这个对象
```java
public class Singleton{
    private static Singleton singleton;
    
    private Singleton(){ }
    
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();}
        }
        return singleton;
}

```
在单线程运行没有什么问题，可以保证永远是一个唯一对象，且在需要的时候获取，但是在多线程就会有问题，可能会有两个或多个线程同时执行到 if判断，会同时创建多个对象，每个线程的对象不唯一，就会出现问题，所以要进行多线程的优化
## 优化或者其他形式

1. 我们希望单例模式的优化点
    1. 尽可能节省资源，就是用的时候才创建，延迟实例化
    2. 多线程下保证所有线程的实例唯一

2. 饿汉式可以避免多线程问题，但是不能延迟实例化，如果实例化消耗的资源无足轻重，可以使用
3. 针对懒汉式的优化
    1. 解决多线程问题，直接的方法就是加锁,对方法加锁，避免了多个线程同时进入这个方法
 ```java
     public class Singleton{
        private static Singleton singleton;

        private Singleton(){ }

        public static synchronized  Singleton getInstance(){
            if (singleton == null){
                singleton = new Singleton();}
            }
            return singleton;
    }
 ```
    2. 在方法上加锁的方法，虽然可以，但是还是会有问题，就是，我们要控制的其实就是第一次实例化的时候，保证只有一个线程进来就好，但是在方法商加锁，就相当于每次获得实例的时候，线程都需要排队拿锁，在已经实例化后这个其实是不必要的，如果你可以接受这个效率的降低，其实也可以，但是也可以改进,使用双重检查加锁，避免资源浪费也避免程序执行效率下降：
 ```java
public class Singleton{
        private  volatile static    Singleton singleton;

        private Singleton(){ }

        public static   Singleton getInstance(){
            if (singleton == null){
                synchronized(Singleton.class){
                    if (singleton == null){
                    singleton = new Singleton();
                    }
                }
            }
               
            }
            return singleton;
    }

```
 
 