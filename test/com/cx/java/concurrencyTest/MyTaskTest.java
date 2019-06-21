package com.cx.java.concurrencyTest;


import com.cx.java.thread.MyTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用Callable+Future来获取执行结果
 * MyTask类实现Callable接口
 * Callable的call()只能通过ExecutorService的submit(Callable<T> task)方法来执行，返回一个<T>Future<T>
 *
 */
public class MyTaskTest {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyTask task = new MyTask();
        Future<Integer> result = executorService.submit(task);//Callable的call()只能通过ExecutorService的submit(Callable<T> task)方法来执行，返回一个<T>Future<T>
        executorService.shutdown();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e1){
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try{
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务完毕");
    }
}
