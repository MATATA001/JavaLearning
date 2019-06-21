package com.cx.java.thread;

public class WeakMem2 {
    static int x = 0;

    public static void main(String[] args){
        Thread thd = new Thread(()->{
            x = 1;
        });
        thd.start();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(x); // what's the value of x?
    }
}
