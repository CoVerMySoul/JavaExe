package com.example.javabasic.javabasic.Annotations;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/12 9:36
 */
public class TestMain {
  @MyAnnotation()
  String x;
  public static void main(String[] args) {
    @SuppressWarnings("unused")
    String str = "abc";

    String z;

    test1();


  }

  @MyAnnotation("t")
  private static void test1() {
  }
}
