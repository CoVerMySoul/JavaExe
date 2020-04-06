package com.jvm.classloader;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/30 22:38
 */
public class MyTest2 {
  public static void main(String[] args) {
    System.out.println(MyParent2.m);
  }
}

class MyParent2{
  public static final String str = "hello world";

  public static final int m = 0;

  public static final short z = 127;
  static {
    System.out.println("MyParent2 static block");
  }
}
