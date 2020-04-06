package com.jvm.classloader;

/**
 * 根类加载器是用null来表示的哦
 * @Author: TanBoQiuYun
 * @Date: 2020/4/5 11:32
 */
public class MyTest13 {
  public static void main(String[] args) {
    //获取系统类加载器
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();
    System.out.println("当前类加载器："+ classLoader);

    while (null != classLoader){
      classLoader = classLoader.getParent();
      System.out.println(classLoader);
    }
  }
}

class A{

}
