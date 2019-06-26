package com.cx.java.thread;

import java.util.concurrent.Callable;

/**
 * Callable call()  有返回值，V call()返回的类型就是传递进来的V类型
 * Runnable run()  void类型，无返回值
 * Callable一般和ExecutorService配合使用
 *
 * ExecutorService中的 submit方法:
 *      1.<T> Future<T> submit(Callable<T> task);
 *      2.<T> Future<T> submit(Runnable task, T result);
 *      3.Future<?> submit(Runnable task);
 *
 * Future类用于对具体的Runnable、Callable结果进行取消、查询是否完成、获取结果.
 * 位于java.util.concurrent包下，它是一个接口：
 *
 *      public interface Future<V> {
 *          boolean cancel(boolean mayInterruptIfRunning);//用来取消任务，如果取消任务成功则返回true，如果取消任务失败则返回false。
 *          boolean isCancelled();//表示任务是否被取消成功，如果在任务正常完成前被取消成功，则返回 true。
 *          boolean isDone();//isDone方法表示任务是否已经完成，若任务完成，则返回true；
 *          V get() throws InterruptedException, ExecutionException;//用来获取执行结果，这个方法会产生阻塞，会一直等到任务执行完毕才返回；
 *          V get(long timeout, TimeUnit unit)//用来获取执行结果，如果在指定时间内，还没获取到结果，就直接返回null。
 *              throws InterruptedException, ExecutionException, TimeoutException;
 *      }
 */
public class MyTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += i;
        }
        return sum;
    }
}
