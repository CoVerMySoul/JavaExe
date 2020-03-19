package com.example.javabasic.javabasic.Utils;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/1/15 17:37
 */
public class regx {
  public static void main(String[] args) {
    while (true){
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      System.out.println(regex1(s));
    }

  }

  private static boolean regex(String str) {
    //是否包含数字
    String regEx =".*[0-9]+.*";
    Pattern pattern = Pattern.compile(regEx);
    return pattern.matcher(str).matches();

  }


  /**
   * \D	匹配一个非数字字符
   * @param str
   * @return
   */
  private static boolean regex1(String str) {
    //是否包含数字
    String regEx ="\\D";
    Pattern pattern = Pattern.compile(regEx);
    return pattern.matcher(str).matches();
  }
}
