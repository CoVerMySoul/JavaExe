package com.tb.exercise.doeverything.Exception;

import java.util.ArrayList;
import java.lang.Exception;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Time: 2019/11/18 14:28
 */
public class ExceptionTest {
  public static void main(String[] args) {
//    methodA();
    String s = methodB();
    System.out.println(s);
  }

  private static String methodB() {

    try{
      System.out.println("进入try块了");
      int[] x = {1,2};
      for (int i = 0; i < 5; i++) {
        System.out.println(x[10]);
      }
      System.out.println("有异常快下面");
      return "aaa";
    }catch (Exception e){
      System.out.println("捕获到异常");
      System.out.println(e);
      System.out.println(e.getMessage());
      System.out.println(e.fillInStackTrace());
      return "bbb";
    }finally {
      System.out.println("finally");
      return "cccc";
    }
  }

  private static void methodA() {
    throw new RuntimeException();
  }
}
