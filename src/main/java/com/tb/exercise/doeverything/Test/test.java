package com.tb.exercise.doeverything.Test;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/11/18 14:48
 */
public class test {
  public static void main(String[] args) {
//    test1();
//    test2();
//    test3();
    test4();
  }

  private static void test4() {
    String regx = "abc*123+tanbo";
    String[] split = regx.split("+");
    System.out.println(split);
  }

  /**
   * 字符串拼接
   */
  private static void test3() {
    StringBuffer stringBuffer = new StringBuffer();
    String replacement = "(?";
    stringBuffer.append(replacement);
    for (int j = 0; j < 5-1; j++) {
      stringBuffer.append(",?");
    }
    stringBuffer.append(")");
    System.out.println(stringBuffer);
  }

  private static void test2() {
    Object object = Arrays.asList(1,2,3,4);
    if (object instanceof Collection){
      System.out.println("hello world");
    }
  }

  private static void test1() {
    //    byte x ;
//    x = 1;
//    char a = '1';
//    boolean b = false;
//    long c = 21000000000000000L;
//    char d = '2';
//    char e = 'abc';
  }
}
