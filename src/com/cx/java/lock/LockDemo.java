package com.cx.java.lock;

import com.cx.java.lock.KingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    int i = 0;
//    Lock lock = new ReentrantLock();//定义一把可重入锁
    Lock lock = new KingLock();//自实现的锁
    public void incr(){
        lock.lock();//加锁
        try {
            i++;//操作,
        }finally {
            lock.unlock();//释放锁
        }

    }

    public static void main(String[] args) throws InterruptedException {
        LockDemo demo = new LockDemo();
        for(int j = 0; j<2;j++){
            Thread thread = new Thread(()->{
                demo.incr();
            });
            thread.start();
        }
//        for(int i=0;i<8;i++){
//            System.out.println(demo.i);
//        }
        System.out.println(demo.i);
    }
}
