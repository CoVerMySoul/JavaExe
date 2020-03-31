package com.example.java8.java8.Java8;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 函数式接口是可以通过三种方式实现的：Lambda表达式、方法引用、构造器引用
 * @Author: TanBoQiuYun
 * @Date: 2019/12/5 10:08
 */
public class LambdaTest2 {
  public static void main(String[] args) {
//    TheInterface theInterface = new TheInterface() {
//      @Override
//      public void myMethod() {
//
//      }
//    };
//
//    TheInterface i = ()->{};
//    System.out.println(i.getClass().getInterfaces()[0]);

    stringToFirstUpper();
  }

  /**
   * Lambda表达式内部迭代
   */
  private static void stringToFirstUpper() {
    List<String> list = Arrays.asList("hello", "world", "hello, world");
//    list.forEach(one ->{
//      System.out.println(one.toUpperCase());
//    });

    //流的方式
    list.stream().map(item -> item.toUpperCase()).forEach(one -> System.out.println(one));
    //方法引用
    list.stream().map(String::toUpperCase).forEach(one -> System.out.println(one));
  }
}

@FunctionalInterface
interface TheInterface {
  void myMethod();
}

@FunctionalInterface
interface TheInterface2 {
  void myMethod2();
}
