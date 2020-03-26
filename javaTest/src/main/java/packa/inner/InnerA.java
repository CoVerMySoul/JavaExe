package packa.inner;

import packa.TestA;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/26 15:54
 */
public class InnerA {
  public static void main(String[] args) {
    TestA a = new TestA();
//    a.testDefault();
//    a.testPrivate();
//    a.testProtected();
    a.testPublic();
  }
}
