package com.example.javabasic.javabasic.String;


import java.nio.charset.StandardCharsets;

/**
 * @Description: String类方法练习
 * @Author: TanBoQiuYun
 * @Date: 2019/12/30 11:07
 */
public class StringTest1 {

  public static void main(String[] args) {
//    test1();
//    test2();
//    test3();
//    test4();
//    test5();
//    test6();
//    test7();
//     test8();
//    test9();
//    test10();
//    test11();
//    test12();
    test13();
  }

  /**
   * matches
   */
  private static void test13() {
    String str = "tanbo";
//    str.matches()
  }

  /**
   * 去字符串前后空格：trim()
   */
  private static void test12() {
    String str = " t anb o ";
    String trim = str.trim();
    System.out.println(trim);
  }

  /**
   * 截取字符串（左开右闭）：substring
   */
  private static void test11() {
    String str = "abcdefg";
    String substring = str.substring(1, 2);
    System.out.println(substring);
  }

  /**
   * 字符串拆分/分隔：spilt
   */
  private static void test10() {
    String str = "a-b-c-d";
    String[] split = str.split("-", 3);
    for (String s : split) {
      System.out.println(s);
    }
  }

  /**
   * 字符串替换：replace、replaceAll、repalceFirst、
   */
  private static void test9() {
    String str = "中国很美丽，这真的很中国";
    String replace = str.replace('中', 'a');
    System.out.println(replace);

    //replace和replaceAll作用是差不多的
    String replace1 = str.replace("中国", "美国");
    System.out.println(replace1);

    //替换第一个出现的元素
    String replace2 = str.replaceFirst("中国", "意大利");
    System.out.println(replace2);
  }

  /**
   * getBytes 和 toCharArray
   */
  private static void test8() {
    String str = "我爱你中国";
    char[] chars = str.toCharArray();
    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
    String hhh = new String(bytes, StandardCharsets.US_ASCII);
    System.out.println(hhh);
    System.out.println("字符");
//    for (char c: chars) {
//      System.out.println(c);
//    }
//    System.out.println("字节");
//    for (byte b: bytes) {
//      System.out.println(b);
//    }
    System.out.println("字节数组的长度：" + bytes.length);
  }

  /**
   * endsWith()
   */
  private static void test7() {
    String str = "test.java";
    boolean start = str.startsWith("test");
    boolean end = str.endsWith("java");
    System.out.println(start);
    System.out.println(end);
  }

  /**
   * contains()
   */
  private static void test6() {
    String str = "tanb %o";
    boolean value = str.contains("%");
    System.out.println(value);
  }

  /**
   * concat方法
   * 体现了String的不可变特性，实际上是创建了一个新的字符串对象，
   * 把原来的字符串依次取出来，然后把新的放到他的后面
   */
  private static void test5() {
    String str = "tanbo";
    String newStr = str.concat("hhhhh");
    System.out.println(newStr);
  }

  /**
   * toString方法
   */
  private static void test4() {
    StringTest1 test1 = new StringTest1();
    String str = "tanbo";
    System.out.println(test1.toString());
    System.out.println(str.toString());
  }

  /**
   * CompareTo方法——compareTo方法
   * 按照两个字符串长度较短的那个作为比较循环的次数
   * 挨个比较元素  str[i] - str[i]循环内如果有结果
   * 如果循环后发现所有的字符都一样  就返回len1-len2
   * 返回0表示两个字符相等
   */
  private static void test3() {
    String str1 = "abc";
    String str2 = "abcdefg";
    String str3 = "fga";
    int i = str1.compareTo(str2);
    int i1 = str1.compareTo(str3);
    System.out.println(i1);
  }

  /**
   * String类——hashCode方法
   */
  private static void test2() {
    char[] chars = {'t', 'b', 'q', 'y'};
    String str = new String(chars);
    System.out.println(str.hashCode());

  }

  /**
   * String类构造方法
   */
  private static void test1() {
    byte[] bytes = new byte[]{65, 97, 33};
    String strByte = new String(bytes);
    System.out.println(strByte);

    char[] chars = {'t', 'b', 'q', 'y'};
    String strChar = new String(chars);
    System.out.println(strChar);

    strByte.compareTo(strChar);

  }

  /**
   * 关于String练习：乱七八糟练习
   */
  private static void test() {
    String str1 = new String("tanbo");
    String str2 = new String("tanbo");
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
    //获取字串 包含头，不包含尾
    String hello = "hello";
    String s = hello.substring(0, 1).toUpperCase() + hello.substring(1);
//    System.out.println(s);
    System.out.println(hello.substring(1, 3));
  }
}
