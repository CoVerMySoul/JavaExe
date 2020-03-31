package com.example.java8.java8.FunctionalInterface.BigFunction;

import java.util.function.BiFunction;

/**
 * @Description: BiFunction 接受两个参数，返回一个结果
 * 四则运算:求两个整数的和，差，积
 * @Author: TanBoQiuYun
 * @Date: 2019/12/22 20:41
 */
public class BiFunctionTest1 {
  public static void main(String[] args) {
    BiFunctionTest1 biFunctionTest1 = new BiFunctionTest1();
    int i = biFunctionTest1.myCompute(2, 3, (arg1, arg2) -> arg1 * arg2);
    System.out.println(i);
  }

  /**
   * 抽象的行为先提前定义好
   *
   * @param a
   * @param b
   * @param biFunction
   * @return
   */
  public int myCompute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
    return biFunction.apply(a, b);
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int mult(int a, int b) {
    return a * b;
  }
}
