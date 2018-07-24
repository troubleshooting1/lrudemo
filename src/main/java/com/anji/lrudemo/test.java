package com.anji.lrudemo;

/**
 * Description: 参考：https://blog.csdn.net/wangxilong1991/article/details/70172302
 * author: chenqiang
 * date: 2018/7/24 10:34
 */
public class test {
    public static void main(String[] args) {
        LRUCache<Integer, String> lru = new LRUCache<Integer, String>(3);

        lru.put(1, "a");
        System.out.println(lru.toString());
        lru.put(2, "b");
        System.out.println(lru.toString());
        lru.put(3, "c");
        System.out.println(lru.toString());
        lru.put(4, "d");
        System.out.println(lru.toString());
        lru.put(1, "aa");
        System.out.println(lru.toString());
        lru.put(2, "bb");
        System.out.println(lru.toString());
        lru.put(5, "e");
        System.out.println(lru.toString());
        lru.get(1);
        System.out.println(lru.toString());
        lru.remove(11);     // 1:aa 5:e 2:bb
        System.out.println(lru.toString());
        lru.remove(1);      //5:e 2:bb
        System.out.println(lru.toString());
        lru.put(1, "aaa");  //1:aaa 5:e 2:bb
        System.out.println(lru.toString());
    }
}
