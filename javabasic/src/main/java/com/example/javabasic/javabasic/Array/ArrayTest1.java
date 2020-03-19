package com.example.javabasic.javabasic.Array;


/**
 * @Author: TanBoQiuYun
 * @Date: 2020/1/15 21:15
 */
public class ArrayTest1 {
  public static void main(String[] args) {
//    test1();
//    test2();
    test3();
  }

  private static void test3() {
//    int a = 10;
//    int b = a;
//    b = 100;
//    System.out.println(a); //10

    int[] x = {10, 20, 30};
    int[] y = x;
    y[0] = 100;
    System.out.println(x[0]);
  }

  /**
   * 动态初始化
   */
  private static void test2() {
    String[] array = new String[5];
    for (String a: array) {
      System.out.println(a);
    }

  }


  /**
   * 静态初始化
   */
  private static void test1() {
    int[] array = new int[]{10,20,30};
    //通过元素在数组中的位置（索引或者叫下标）来访问
    int i = array[0];
    i =4;
    System.out.println();
  }
}
