package com.example.javabasic.javabasic.String;

/**
 * @Description: 字符串
 * @Author: TanBoQiuYun
 * @Date: 2019/12/25 17:41
 */
public class StringTest {

  public static void main(String[] args) {
    final String x;
    String str = "tb";
    str = str + "qy";
    test1();
    test2();
  }

  /**
   * 产生了几个String对象 7个,字符串常量池7个
   * 对象1——> value[] a   "a"
   * 对象2——> value[] b   "b"
   * 对象3——> value[] {a,b}   "ab"
   * 对象4——> value[] c   "c"
   * 对象5——> value[] {ab, c}   "abc"
   * 对象6——> value[] d   "d"
   * 对象7——> value[] {abc, d}   "abcd"
   */
  private static void test2() {
    String str = "a" + "b" + "c" + "d";


  }

  private static void test1() {
    //String类  "abc" 对象 常量区
    String s1 = "abc";
    String s2 = "abc";
    String s3 = new String("abc");
    String s4 = new String("abc");
    System.out.println(s1 == s2); //true
    System.out.println(s1 == s3); // false
    System.out.println(s3 == s4);// false
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1.equals(s3));//true
    System.out.println(s1.equals(s4));//true
    System.out.println(s3.equals(s4));

  }
}
