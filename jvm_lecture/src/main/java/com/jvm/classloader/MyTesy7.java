package com.jvm.classloader;

/**
 * 关于类加载器的双亲委托机制
 * @Author: TanBoQiuYun
 * @Date: 2020/4/5 9:42
 */
public class MyTesy7 {
  public static void main(String[] args) throws Exception{
    Class<?> clazz1 = Class.forName("java.lang.String");
    System.out.println(clazz1.getClassLoader());

    Class<?> clazz2 = Class.forName("com.jvm.classloader.C");
    System.out.println(clazz2.getClassLoader());
  }
}

class C{

}
