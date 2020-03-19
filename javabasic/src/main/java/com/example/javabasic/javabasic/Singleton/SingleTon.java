package com.example.javabasic.javabasic.Singleton;

/**
 * 单例模式通过我的设计，让这个类只能创建一个对象
 * 这种方式是饿汉式
 * @Author: TanBoQiuYun
 * @Date: 2020/2/25 10:26
 */
public class SingleTon {

  /**
   * 1、让构造方法变成私有，保证外面不可以随便创建对象
   */
  private SingleTon(){}

  /**
   * 2、在当前类中存在一个私有的静态属性，是当前类型的
   */
  private static SingleTon single = new SingleTon();

  /**
   * 3、提供一个获取单个对象的方法给用户
   * @return
   */
  public static SingleTon getSingleTon(){
    return single; //引用类型
  }
}
