package com.example.javabasic.javabasic.String;

/**
 * StringBuilder和StringBuffer
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/1/6 10:08
 */
public class BuilderAndBuffer {
  public static void main(String[] args) {
    test1();
  }

  private static void test1() {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuffer stringBuffer = new StringBuffer();

    stringBuilder.append("第一个串").append("第二个串").append(" ").append(true);
    System.out.println(stringBuilder.toString());
  }
}
