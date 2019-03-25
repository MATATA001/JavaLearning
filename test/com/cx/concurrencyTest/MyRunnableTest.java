package com.cx.concurrencyTest;

import thread.MyRunnable;

public class MyRunnableTest {
    public static void main(String[] args){
        System.out.println("主线程ID："+Thread.currentThread().getId());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();//start()创建新线程
        myRunnable.run();//调用run() 和普通方法调用没区别，不会创建新的线程
    }
}
