package com.cx.designPattern;

/**
 * 使用枚举实现单例模式
 * 优点：实现简单，枚举本身就是单例模式。由JVM从根本上提供保障，避免通过反射和序列化的漏洞，最安全
 * 缺点：无延迟加载
 */
public enum Singleton6 {
    //静态变量，这里不需要
//    private static Singleton6 single;
    //构造器私有
//    private Singleton6(){}
    INSTANCE;//代表我们的实例对象
    public void add(){
        System.out.println("i am enum type");
    }
}
