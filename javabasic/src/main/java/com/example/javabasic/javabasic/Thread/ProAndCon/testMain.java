package com.example.javabasic.javabasic.Thread.ProAndCon;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/2/22 10:43
 */
public class testMain extends Object{
  public static void main(String[] args) {
    WareHouse wareHouse = new WareHouse();
    Producer producer = new Producer(wareHouse);

    //设置线程的优先级别（1-10）
    producer.setPriority(10);
    Comsumer c1 = new Comsumer(wareHouse);
    Comsumer c2 = new Comsumer(wareHouse);

    producer.start();
    c1.start();
    c2.start();
  }
}
