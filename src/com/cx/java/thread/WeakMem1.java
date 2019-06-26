package com.cx.java.thread;

public class WeakMem1 {
    static int x = 0;

    public static void main(String[] args){
        Thread thd = new Thread(()->{
            x = 1;
        });
        thd.start();

        for(int i=0; i<10; i++)
            System.out.println(x); // what's the value of x?
    }
}
