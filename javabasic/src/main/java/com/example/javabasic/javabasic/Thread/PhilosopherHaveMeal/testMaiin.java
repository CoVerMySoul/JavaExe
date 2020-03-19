package com.example.javabasic.javabasic.Thread.PhilosopherHaveMeal;

/**
 * 测试哲学家就餐问题
 * @Author: TanBoQiuYun
 * @Date: 2020/3/17 21:35
 */
public class testMaiin {
  public static void main(String[] args) {
    Chopstick c1 = new Chopstick(1);
    Chopstick c2 = new Chopstick(2);
    Chopstick c3 = new Chopstick(3);
    Chopstick c4 = new Chopstick(4);

    Philosopher p1 = new Philosopher("a", c2, c1, 0);
    Philosopher p2 = new Philosopher("b", c3, c2, 3000);
    Philosopher p3 = new Philosopher("c", c4, c3, 6000);
    Philosopher p4 = new Philosopher("d", c1, c4, 9000);

    p1.start();
    p2.start();
    p3.start();
    p4.start();

  }
}
