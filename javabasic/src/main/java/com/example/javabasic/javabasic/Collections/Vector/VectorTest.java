package com.example.javabasic.javabasic.Collections.Vector;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/23 14:12
 */
public class VectorTest {
  public static void main(String[] args) {

    test1();
  }

  /**
   * 三个构造方法扩容
   */
  private static void test1() {
    Vector<String> vector = new Vector<>();
    for (int i = 0; i < 100; i++) {
      vector.add("a");
      System.out.println(vector.size() + "--" + vector.capacity());
    }
  }
}
