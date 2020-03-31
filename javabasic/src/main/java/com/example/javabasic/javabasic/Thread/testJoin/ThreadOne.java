package com.example.javabasic.javabasic.Thread.testJoin;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/17 14:03
 */
public class ThreadOne extends Thread {

  @Override
  public void run() {
    System.out.println("thread one start");
    ThreadTwo two = new ThreadTwo();
    two.start();
    try {
      two.join(2000);//让线程2加入线程1
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("thread one end");
  }
}
