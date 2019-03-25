package thread;

/**
 * 创建自己的线程类
 * java中创建线程的方式之一，继承Thread类
 * 重写run(),在run方法中定义需要执行的任务
 * 继承Thread类比实现Runnable接口要简洁，但是因为java只允许单继承
 * 所以当自定义类需要继承其他类时，只能选择实现Runnable接口
 */
public class MyThread extends Thread{
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("name:" + name + "子进程ID："+Thread.currentThread().getId());
    }

}
