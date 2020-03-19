package com.example.javabasic.javabasic.Thread.ProAndCon;

import java.util.ArrayList;

/**
 * 仓库
 * @Author: TanBoQiuYun
 * @Date: 2020/2/22 9:57
 */
public class WareHouse {
  private ArrayList<String> list = new ArrayList<>();


  /**
   * 往仓库里面放元素
   */
  public synchronized void add(){
    if (list.size() < 20){
      list.add("a");
    }else {
//      return;//让方法执行到这里就结束方法
      try {
        this.notifyAll();
        this.wait();//仓库调用wait,不是让仓库对象等待，而是让访问仓库对象的生产者线程等待
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * 从仓库集合里面获取元素
   */
  public synchronized void get(){
    if (list.size() > 0){
      list.remove(0);//集合越界的问题
    }else {
//      return;
      try {
        this.notifyAll();
        this.wait();//仓库调用wait,不是让仓库对象等待，而是让访问仓库对象的消费者线程等待
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
