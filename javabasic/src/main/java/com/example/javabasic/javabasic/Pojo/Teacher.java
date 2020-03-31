package com.example.javabasic.javabasic.Pojo;

/**
 * 老师也是人，所以继承People
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/1/16 14:15
 */
public class Teacher extends People {
  public void eat() {
    System.out.println("老师得吃饭方法");
  }

  //  public void sleep(){
//    System.out.println("人类得睡觉方法");
//  }
//  public void talk(){
//    System.out.println("人类得说话方法");
//  }
  public void teach() {
    System.out.println("老师需要上课教书，老师得独有方法");
  }
}
