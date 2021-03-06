package com.jvm.classloader;

import java.util.UUID;

/**
 * 当一个常量的值并非编译期间可以确定的时候，那么其值就不会被放到调用类的常量池中，
 * 这时在程序运行的时候，会导致主动使用这个常量所在的类，所以显然会导致这个类被初始化
 *
 * @Description: 这个类 会输出MyParent3的静态代码块
 * @Author: TanBoQiuYun
 * @Date: 2020/4/1 14:47
 */
public class MyTest3 {
  public static void main(String[] args) {
    System.out.println(MyParent3.str);
  }
}

class MyParent3{
  public static final String str = UUID.randomUUID().toString();
  static {
    System.out.println("MyParent3 block code");
  }
}
