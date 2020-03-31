package com.example.javabasic.javabasic.Static;

/**
 * 测试static特征修饰符
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/3/27 10:27
 */
public class People {
  public String name;
  public static int age;

  public void testPT() {
    System.out.println("我是一个普通方法" + age);
  }

  public static void testStatic() {

    System.out.println("我是一个静态方法" + age);
  }

  public static void main(String[] args) {
    People one = new People();
    one.name = "first";
    one.age = 18;
    People two = new People();
    two.name = "second";
    two.age = 10;
    System.out.println(one.name + one.age);
    System.out.println(two.name + two.age);
  }
}
