package com.example.javabasic.javabasic.Thread.PhilosopherHaveMeal;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/17 21:34
 */
public class Philosopher extends Thread{

  private String pname;
  private Chopstick left;
  private Chopstick right;
  private long time;

  public Philosopher(String pname, Chopstick left, Chopstick right, long time){
    this.pname = pname;
    this.left = left;
    this.right = right;
    this.time = time;
  }

  public void run() {

    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    synchronized (left){
      System.out.println(this.pname+"哲学家拿起了左手边的筷子" + this.left.getNum());
      synchronized (right){
        System.out.println(this.pname+"哲学家拿起了右手边的筷子" + this.right.getNum());
        System.out.println(this.pname + "开始吃饭啦");
      }
    }
  }
}
