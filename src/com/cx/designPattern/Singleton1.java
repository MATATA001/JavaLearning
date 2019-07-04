package com.cx.designPattern;

/**
 * singleton--单例模式-饿汉式（static对象，类加载的时候就创建对象）
 * 提供一个静态变量，用来接收实例对象
 * 构造方法私有
 * 提供一个公有的、静态的，给外部调用获取对象的方法
 * 优点：饿汉式单例模式代码中，static变量会在类加载时初始化，此时不会涉及多个线程对象访问该对象的问题。
 *      虚拟机保证只会装载一次，不会发生并发访问的问题，因此可以省略synchronized关键字，不存在线程安全的问题。
 *      调用效率高。
 * 缺点：如果只是加载本类，而不是要调用getInstance（），甚至永远没有调用，造成了资源浪费
 * @author cx
 */
public class Singleton1 {
    //1.提供一个静态变量，用来接收实例对象
    private static Singleton1 singleton = new Singleton1();
    //2.构造器私有
    private Singleton1(){};
    //3.提供一个公有的、静态的，给外部调用获取对象的方法
    public static Singleton1 getInstance() {
        return singleton;
    }



}
