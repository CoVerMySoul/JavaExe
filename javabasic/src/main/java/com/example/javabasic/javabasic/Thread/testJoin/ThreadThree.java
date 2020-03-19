package com.example.javabasic.javabasic.Thread.testJoin;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/17 15:00
 */
public class ThreadThree extends Thread{
  private ThreadTwo threadTwo;
  public ThreadThree(ThreadTwo threadTwo){
    this.threadTwo = threadTwo;
  }

  @Override
  public void run() {
    System.out.println("thread three start");
    synchronized (threadTwo){
      System.out.println("two is lock");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("two is free");
    }
    System.out.println("thread three end");
  }
}
