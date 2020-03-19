package com.example.javabasic.javabasic.String;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * 关于String类的小作业
 * @Author: TanBoQiuYun
 * @Date: 2020/1/7 9:50
 */
public class HomeWork {
  public static void main(String[] args) {
//    test1();
//    test2();
    test3();
    test4();
    test5();
    test6();
  }

  /**
   * 寻找若干字符串中长度最长的那个
   */
  private static void test6() {
    String str = "ab, abc, abcd";
    String[] split = str.split(",");
  }

  /**
   * 将给定的字符串每一个首字母大写
   */
  private static void test5() {
    String str = "this is a test of java";
    String[] splitStr = str.split(" ");
    String lastStr = "";
    for (String item : splitStr) {
      String substringFirst = item.substring(0,1).toUpperCase();
      String substringRemain = item.substring(1);
      String newStr = substringFirst + substringRemain;
      lastStr = lastStr + newStr + " ";
    }
    System.out.println("大写后的字符串：" + lastStr);
  }

  /**
   * 获取给定字符串中的全部数字
   * Character.isDigit判断是否是数字
   */
  private static void test4() {
    String str = "aadf1df3dgfd5";
    String strNumber = "";
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (Character.isDigit(chars[i])){
        strNumber = strNumber + chars[i];
      }
    }
    System.out.println("数字字符串：" + strNumber);
  }

  /**
   * 统计给定的字母在字符串中出现的次数
   */
  private static void test3() {
    String str = "this is a test of java";
    char[] chars = str.toCharArray();
    int count = 0;
    for (char c : chars) {
      if (c == ' '){
        count++;
      }
    }
    System.out.println("出现的次数：" + count);
  }

  /**
   * 判断一个字符串是否是回文字符串
   * 回文字符串：是一个正读和反读都一样的字符串。
   * abccba
   */
  private static void test2() {
    while (true){
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入回文字符串：");
      String str = scanner.nextLine();
//      if (isPalindrome(str)){
//        System.out.println("该字符串是回文字符串");
//      }else {
//        System.out.println("该字符串不是回文字符串");
//      }
    }

  }

//  private static boolean  isPalindrome(String str) {
//    int len = str.length();
//    int beginIndex = 0;
//    int endIndex = len - 1;
//    while (beginIndex < endIndex){
//      if (str.charAt(beginIndex) != str.charAt(endIndex)){
//        return false;
//      }
//      beginIndex++;
//      endIndex--;
//    }
//    return true;
//  }


  /**
   * 将字符串反转
   */
  private static void test1() {
    String str = "tanbo";
    char[] chars = str.toCharArray();
    String revese = "";
    for (int i = chars.length-1; i >=0; i--) {
      revese = revese + chars[i];
    }
    System.out.println(revese);
  }
}
