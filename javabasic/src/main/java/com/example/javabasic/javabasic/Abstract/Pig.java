package com.example.javabasic.javabasic.Abstract;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/1/7 15:58
 */
public class Pig {
  public void eat() {
    System.out.println("猪也不能随便吃，提供饲料");
  }

  public void sleep() {
    System.out.println("猪也不能随便睡， 温暖的猪窝");
  }

  AbstactInterface abstactInterface;

  public void hhh() {
    abstactInterface.test();
  }
}
