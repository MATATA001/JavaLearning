package com.cx.java.classLoaderProgramming;

import com.cx.java.ioProgramming.IoProgramming;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassLoader与 instanceof 关键字
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {

        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {

                    String fileName = name.substring(0,name.lastIndexOf(".")) + ".class";

                    InputStream in = getClass().getResourceAsStream(fileName);
                    if (in == null) {
                        return super.loadClass(name);
                    }

                    byte[] bytes = new byte[in.available()];
                    in.read(bytes);
                    return defineClass(name, bytes, 0, bytes.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };
        myLoader.loadClass("IoProgramming.class");
    }
}
