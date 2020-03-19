package com.example.javabasic.javabasic.String;

import org.apache.commons.lang3.StringUtils;

/**
 * StringUtils工具类练习
 * @Author: TanBoQiuYun
 * @Date: 2020/1/6 17:44
 */
public class StringUtilsTest {
  public static void main(String[] args) {
    test1();
  }

  private static void test1() {
    String str = "tanbo";
    boolean blank = StringUtils.isBlank(str);

  }
}
