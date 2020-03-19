package com.example.javabasic.javabasic.Abstract;

/**
 * 关于接口
 * @Author: TanBoQiuYun
 * @Date: 2020/1/9 15:26
 */
public interface AbstactInterface{
  String name = "tanbo";//public static final省略
  public String test(); //只定义规则，不描述具体过程
  //jdk1.8之后，可以用默认方法的实现
  default void getBread(){

  }

  //不能有构造方法
//  public AbstactInterface(){
//
//  }
//不能有代码块
//  static {
//
//  }
}
