package com.example.javabasic.javabasic.Thread;

/**
 * 继承了Thread类或者实现Runable接口，就表示这个类是一个线程，可以并发执行
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/2/21 16:52
 */
public class RunningMan implements Runnable {

  private String name;

  public RunningMan() {

  }

  public RunningMan(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(this.name + "跑到第" + i + "米了");
    }
  }
}
