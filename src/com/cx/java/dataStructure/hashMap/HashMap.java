package com.cx.java.dataStructure.hashMap;


public class HashMap<K,V> implements Map<K,V> {

    private Entry<K,V>[] table = null;
    private static int defalutLen = 16;
    private int size=0;

    public HashMap(){
        table = new Entry[defalutLen];
    }


    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    //内部类
    class Entry<K,V> implements Map.Entry<K,V>{

        @Override
        public V getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }
    }
}
