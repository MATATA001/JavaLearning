package com.cx.java.dataStructure.hashMap;

/**
 * 定义接口
 * @param <K>
 * @param <V>
 */
public interface Map<K, V> {
    K getKey();

    V getValue();

    int size();

    interface Entry<K,V>{
        V getKey();
        V getValue();
    }
}
