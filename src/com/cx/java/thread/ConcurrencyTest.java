package com.cx.java.thread;

public class ConcurrencyTest {
    private static final long count = 1000000001;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();

    }

    public static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for(long i = 0; i < count; i++){
            b--;
        }
        long time = System.currentTimeMillis()-start;
        thread.join();
        System.out.println("concurrency : "+time+"ms,b="+b);
    }
    public static void serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for(long i = 0; i<count;i++){
            a +=5;
        }
        int b = 0;
        for(long i = 0; i < count; i++){
            b--;
        }
        long time = System.currentTimeMillis()-start;
        System.out.println("serial:"+time+"ms,b="+b);
    }
}
