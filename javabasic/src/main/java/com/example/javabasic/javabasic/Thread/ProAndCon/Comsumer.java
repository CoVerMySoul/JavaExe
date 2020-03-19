package com.example.javabasic.javabasic.Thread.ProAndCon;

/**
 * 消费者线程
 * @Author: TanBoQiuYun
 * @Date: 2020/2/22 9:56
 */
public class Comsumer extends Thread{
  private WareHouse wareHouse;

  public Comsumer(WareHouse wareHouse){
    this.wareHouse = wareHouse;
  }
  @Override
  public void run() {
    while (true){
      this.wareHouse.get();
      System.out.println("消费者拿走了一件货物");
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
