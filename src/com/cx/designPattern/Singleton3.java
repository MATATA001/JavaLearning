package com.cx.designPattern;

/**
 * 双重检测锁方式
 * 优点：
 * 缺点：编译器优化和jvm原因 稳定性不高
 */
public class Singleton3 {
    private static Singleton3 singleton3 = null;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(singleton3 == null){
            Singleton3 sc;
            synchronized (Singleton3.class){

            }
        }
        return singleton3;
    }

}
