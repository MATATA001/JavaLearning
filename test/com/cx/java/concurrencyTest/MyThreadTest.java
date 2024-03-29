package com.cx.java.concurrencyTest;

import com.cx.java.thread.MyThread;

/**
 * 测试调用start() 和run()的不同
 * 从输出结果可以得出以下结论：
 *
 * 1）thread1和thread2的线程ID不同，thread2和主线程ID相同
 * 说明通过run方法调用并不会创建新的线程，而是在主线程中直接运行run方法，跟普通的方法调用没有任何区别；
 *
 * 2）虽然thread1的start方法调用在thread2的run方法前面调用，
 * 但是先输出的是thread2的run方法调用的相关信息，说明新线程创建的过程不会阻塞主线程的后续执行。
 *
 */
public class MyThreadTest {

    public static void main(String[] args){
        System.out.println("主线程ID："+Thread.currentThread().getId());
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();
    }
}
