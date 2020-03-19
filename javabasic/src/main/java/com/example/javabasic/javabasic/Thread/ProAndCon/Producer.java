package com.example.javabasic.javabasic.Thread.ProAndCon;

/**
 * 生产者线程
 * @Author: TanBoQiuYun
 * @Date: 2020/2/22 9:56
 */
public class Producer extends Thread{

  //仓库对象
  private WareHouse wareHouse;

  public Producer(WareHouse wareHouse){
    this.wareHouse = wareHouse;
  }

  /**
   * 生产者的run方法，一直像仓库里面添加元素
   */
  @Override
  public void run() {
    while (true){
      this.wareHouse.add();
      System.out.println("生产者存入了一件货物");
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
