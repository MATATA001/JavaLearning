package com.cx.designPatternTest;

import com.cx.designPattern.Singleton2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射构造对象
 */
public class Singleton2Test {
    public static void main(String[] args) throws Exception {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);

        //TODO:了解反射原理
        Class<Singleton2> clazz = (Class<Singleton2>) Class.forName("com.cx.designPattern.Singleton2");
        Constructor<Singleton2> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Singleton2 s11 = c.newInstance();
        Singleton2 s22 = c.newInstance();
        System.out.println(s11);
        System.out.println(s22);

    }
}
