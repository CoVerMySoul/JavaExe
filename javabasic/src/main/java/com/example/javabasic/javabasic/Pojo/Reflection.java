package com.example.javabasic.javabasic.Pojo;

/**
 * 用来测试反射的
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/3/27 17:49
 */
public  class Reflection {

  public Reflection(){
    System.out.println("我是Reflection的无参构造方法");
  }

  public void eat(){
    System.out.println("Reflection的吃饭方法");
  }

  public String eat(String str){
    System.out.println("Reflection的吃饭方法,带参数");
    return str;
  }
}
