package com.cx.java.thread;

public class WeakMem3 {
    static int x = 0;
    static boolean finished = false;

    public static void main(String[] args) throws Exception{
        Thread thd = new Thread(()->{
            x = 1;
            finished = true;
        });
        thd.start();


        while(!finished){
            System.out.println("waiting");
        }
    }
}
