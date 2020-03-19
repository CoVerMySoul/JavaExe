package com.tb.exercise.doeverything.Exception;

/**
 * @Description: 自定义异常
 * @Author: TanBoQiuYun
 * @Date: 2019/11/21 11:11
 */
public class MyFirstException extends Exception{

  public MyFirstException(){
    super();
  }

  public MyFirstException(String message){
     super(message);
  }

}

class TestException {
  void test() throws MyFirstException{

  }

  public static void main(String[] args) {
    try {
      new TestException().test();
    } catch (MyFirstException e) {
      e.printStackTrace();
    }
  }
}
