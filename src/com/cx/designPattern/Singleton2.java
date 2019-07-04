package com.cx.designPattern;

public class Singleton2 {
    //1.提供一个静态变量，用来接收实例对象
    private static Singleton2 singleton2;
    //2.构造器私有
    private Singleton2(){
        /**
         * 防止通过反射创建对象---通过在构造方法里判断，并抛异常
         */
//        System.out.println("AAAAAAAAAA");
//        if(singleton2 != null){
//            throw new RuntimeException();
//        }
    }
    //3.提供一个公有的、静态的，给外部调用获取对象的方法
    public static synchronized Singleton2 getInstance() {
        if(singleton2 ==null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
