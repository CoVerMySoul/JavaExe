package com.example.javabasic.javabasic.Thread.testJoin;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/17 14:03
 */
public class ThreadTwo extends Thread {

  @Override
  public void run() {
    System.out.println("thread two start");
    ThreadThree three = new ThreadThree(this);
    three.start();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("thread two end");
  }
}
