package com.example.javabasic.javabasic.Test;

import com.example.javabasic.javabasic.Pojo.Student;

/**
 * 测试
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/3/27 17:16
 */
public class TestMain {
  public static void main(String[] args) {
    int a = '2';
    System.out.println(a);
    test1();
  }

  /**
   * 9 * 9 乘法表
   */
  private static void test1() {
    for (int i =1;i<=9;i++){
      for (int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + (i*j)+" ");
      }
      System.out.println();
    }
  }
}
