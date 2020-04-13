package com.example.javabasic.javabasic.InnerClass;

/**
 * 测试内部类
 * @Author: TanBoQiuYun
 * @Date: 2020/4/9 22:19
 */
public class TestMain {
  public static void main(String[] args){
      test1();
      test2();

  }

  private static void test1() {
    OuterClass outerClass = new OuterClass();
//    outerClass.tesstOuterClassMethod();
//    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//    innerClass.TestInnerClassMethod();

//    outerClass.testOne();
    OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
  }

  /**
   * 匿名内部类
   */
  private static void test2() {
    TestInterface testInterface = new TestInterface() {
      @Override
      public void testMethod() {

      }
    };
  }
}
