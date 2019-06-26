package com.cx.java.lock;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

public class KingLock implements Lock {

    AtomicReference<Thread> owner = new AtomicReference<>();//原子操作类，相当于一把具备原子性的钥匙
    //放入线程的等待列表
    public LinkedBlockingQueue<Thread> waiters = new LinkedBlockingQueue<>();

    //实现 方法以打开房间为例 非公平因为没有考虑
    @Override
    public void lock() {
        //抢房卡
        // owner = Thread.currentThread();不可以，因为可能很多人在抢
        while(!owner.compareAndSet(null,Thread.currentThread())) {//CAS机制，期望为null才可以抢，把当前线程放进去。返回为True成功，但CAS机制大部分为false所以主要考虑false情况
            waiters.add(Thread.currentThread());//加入等待列表
            LockSupport.park();//要这个线程等待---线程挂起

            waiters.remove(Thread.currentThread());//如果执行到这一步，证明已经被唤醒了，所以从列表中删除就可以了
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    //实现 退房方法
    @Override
    public void unlock() {//多线程，原子性
        //判断，必须是抢到房卡的人才能退房
        //if(owner == Thread.currentThread())没有保证原子性
        if(owner.compareAndSet(Thread.currentThread(),null)){//CAS机制，如果是当前则置null
            //通知等待的（阻塞的）线程可以去拿钥匙了，把这个线程从等待列表删除
            //可能有多个线程，所以for循环一下
            Object[] objects = waiters.toArray();//数组化，为了方便遍历
            for(Object object:objects){
                Thread next = (Thread)object;//强转回线程
                LockSupport.unpark(next);//唤醒所有线程，但这样是有先后顺序的。
                //删除在这里写比较麻烦不够优雅，所以不在这里写，在lock方法里写
            }

        }
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
