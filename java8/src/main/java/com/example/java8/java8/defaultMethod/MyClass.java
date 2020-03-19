package com.example.java8.java8.defaultMethod;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/12/16 17:25
 */
public class MyClass implements MyInterface1, MyInterface2{

  @Override
  public void myInterface() {
//    System.out.println("myClass");
    MyInterface2.super.myInterface();
  }

  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    myClass.myInterface();
  }

}
