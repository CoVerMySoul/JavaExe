package com.example.javabasic.javabasic.Thread;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/2/21 16:59
 */
public class testMain {
  public static void main(String[] args) {
    //1、new一个线程对象，相当于这里有三个人了
    RunningMan r1 = new RunningMan("苏炳添");
    RunningMan r2 = new RunningMan("博尔特");
    RunningMan r3 = new RunningMan("加特林");
    //2、调用start()方法让线程进入就绪状态(如果是RunningMan继承了Thread类)
//    r1.start();//start方法是Thread类里面继承过来的
//    r2.start();
//    r3.start();
    //2、调用start()方法让线程进入就绪状态(如果是RunningMan实现了Runable接口)
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    Thread t3 = new Thread(r3);
    t1.start();//start方法是Thread类里面继承过来的
    t2.start();
    t3.start();
  }
}
