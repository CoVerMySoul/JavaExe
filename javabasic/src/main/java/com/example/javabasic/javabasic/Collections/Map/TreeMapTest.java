package com.example.javabasic.javabasic.Collections.Map;

import java.util.TreeMap;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/25 17:21
 */
public class TreeMapTest {
  public static void main(String[] args) {
    test1();
  }

  private static void test1() {
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    treeMap.put(5, "e");//map集合种得key是需要可比较得，key得对象需要实现Comparable接口
    treeMap.put(2, "b");
    treeMap.put(6, "f");
    treeMap.put(1, "a");
    treeMap.put(4, "d");
    treeMap.put(3, "c");


    System.out.println(treeMap);
  }
}


