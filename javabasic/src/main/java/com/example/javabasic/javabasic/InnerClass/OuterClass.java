package com.example.javabasic.javabasic.InnerClass;

import java.util.ArrayList;
import java.util.List;

/**
 * 内部类
 * @Author: TanBoQiuYun
 * @Date: 2020/4/9 22:00
 */
public class OuterClass {
  private String name = "这是正常类中的属性";
  public void testOuterClassMethod(){
    System.out.println("这是正常类中的方法");
  }

  public void testOne(){
    final String s;
    //定义一个局部内部类
     class TestInnerOneMethod{
      String xxx = "1";
      String yyy = name;
//      System.out.println();
    }
  }

//  public void testTwo(){
//    String s;
//    //定义一个局部内部类
//    final class TestInnerOneMethod{
//
//    }
//  }

  //成员内部类
  public class InnerClass{
    private String name = "这是内部类中的属性";
    public void TestInnerClassMethod(){
      System.out.println("我是成员内部类中的方法" + OuterClass.super.getClass());
      testOuterClassMethod();
    }
  }

  //静态内部类
  public static class InnerStaticClass{

  }
}
