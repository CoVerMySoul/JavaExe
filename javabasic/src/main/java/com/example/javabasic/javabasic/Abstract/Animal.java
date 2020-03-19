package com.example.javabasic.javabasic.Abstract;

/**
 * 抽象类的练习
 * @Author: TanBoQiuYun
 * @Date: 2020/1/7 15:46
 */
public abstract class Animal {

  public Animal(){

  }

  public abstract void eat();

  public void sleep(){
    System.out.println("动物随便睡");
  }
}
