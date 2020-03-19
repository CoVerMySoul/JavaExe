package com.example.javabasic.javabasic.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/1/12 14:44
 */
public class HashMapTest {
  public static void main(String[] args) {
   test1();
  }

  private static void test1() {
    HashMap<Integer, String> hashMap = new HashMap();
    //将一些key-value映射关系存入集合

    hashMap.put(1, "aaa");
    hashMap.put(2, "bbb");
    hashMap.put(3, "ccc");
    hashMap.put(4, "ddd");
    hashMap.put(5, "eee");
    hashMap.put(6, "fff");
    hashMap.put(7, "jjjj");
    String s = hashMap.get(6);
    s = "tb";
//    System.out.println(hashMap);
    //Map集合的遍历，先获取到所有的key，再通过key遍历获取value
    Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
    System.out.println("entries：" + entries);
    Set<Integer> keys = hashMap.keySet();
//    for (Integer key:keys
//         ) {
//      System.out.println(hashMap.get(key));
//    }

  }
}
