package com.cx.java.thread;

public class WordTearing {
    static boolean arr[] = new boolean[10];

    public static void main(String[] args) throws InterruptedException {
        Thread thd = new Thread(()->{
            arr[0] = true;
        });
        Thread thd2 = new Thread(()->{
            arr[1] = false;
        });
        thd.start();
        thd2.start();
        thd.join();
        thd2.join();
        System.out.println(arr[0]+" "+arr[1]);
    }
}

