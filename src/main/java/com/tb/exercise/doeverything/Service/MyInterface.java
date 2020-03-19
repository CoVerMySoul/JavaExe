package com.tb.exercise.doeverything.Service;


/**
 * 函数式接口
 */
@FunctionalInterface
public interface MyInterface {
  void test();

//  void x();
  String toString();
}

class Test2{
  public void myTest(MyInterface myInterface){
    System.out.println(1);
    myInterface.test();
    System.out.println(2);
  }

  public static void main(String[] args) {
    Test2 test2 = new Test2();
//    test2.myTest();
  }
}
