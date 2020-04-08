package com.jvm.classloader;

/**
 * @
 * @Author: TanBoQiuYun
 * @Date: 2020/4/8 15:09
 */
public class MyTest15 {
  public static void main(String[] args) {
    String[] str = new String[2];
    System.out.println(str.getClass().getClassLoader());

    int[] ints = new int[3];
    System.out.println("基本类型" + ints.getClass().getClassLoader());

    MyTest15[] myTest15s = new MyTest15[5];
    System.out.println(myTest15s.getClass().getClassLoader());
  }
}
