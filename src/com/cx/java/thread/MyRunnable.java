package com.cx.java.thread;

/**
 * java创建线程方法之二：实现Runnable接口--通过实现Runnable接口，我们定义了一个子任务，然后将子任务交由Thread去执行。
 * 注意，这种方式必须将Runnable作为Thread类的参数，然后通过Thread的start方法来创建一个新线程来执行该子任务。
 * 如果调用Runnable的run方法的话，是不会创建新线程的，这和普通的方法调用没有任何区别。
 *
 * 因为java只允许单继承，所以当自定义类需要继承其他类时，只能选择实现Runnable接口
 */
public class MyRunnable implements Runnable{

    public MyRunnable(){

    }

    @Override
    public void run() {
        System.out.println("子线程ID："+Thread.currentThread().getId());
    }
}
