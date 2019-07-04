package com.cx.designPatternTest;

import com.cx.designPattern.Singleton6;

public class Singleton6Test {
    public static void main(String[] args){
        Singleton6 ss6 = Singleton6.INSTANCE;
        Singleton6 ss7 = Singleton6.INSTANCE;

        if(ss6 == ss7){
            System.out.println("true");

        }
    }

}
