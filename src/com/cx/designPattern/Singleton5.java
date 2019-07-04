package com.cx.designPattern;

/**
 * 静态内部类方式
 * 线程安全、调用效率高、懒加载
 * 药店：外部类没有static属性，不会饿汉式那样立即加载对象
 *
 */
public class Singleton5 {
    //静态变量，静态内部类提供所以这里不需要
//    private static Singleton5 single;
    //构造器私有
    private Singleton5(){}

    //静态内部类
    private static class SingletonInnerClass{
        private static final Singleton5 instance = new Singleton5();
    }
    //公有的静态的外部调用的获取对象方法
    public static Singleton5 getInstance(){
        return SingletonInnerClass.instance;
    }

}
