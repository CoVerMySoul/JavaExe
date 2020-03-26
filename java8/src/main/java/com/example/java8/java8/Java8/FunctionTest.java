package com.example.java8.java8.Java8;

//import com.example.javabasic.javabasic.FanXing.packa;

import java.util.function.Function;

/**
 * @Description: Lambda表达式传递的不是值，是行为！
 * 在以前的方式中，是先定义好了行为（行为已经存在），然后再调用这个行为进行使用，
 * 而现在是相反，行为是提前并不存在，是通过方法的传递来进行告知的
 * @Author: TanBoQiuYun
 * @Date: 2019/12/10 16:11
 */
public class FunctionTest {
  public static void main(String[] args) {
    FunctionTest test = new FunctionTest();
    System.out.println(test.compute(1, value -> {return  2*value;}));
    System.out.println(test.compute(2, arg -> 5+arg));
    System.out.println(test.compute(3, value -> value*value));

    System.out.println(test.convert(5, tanbo -> String.valueOf(tanbo+"hellowordl")));
    Function<Integer, Integer> function = value -> 100 * value;
    System.out.println(test.compute(100, function));
  }

  public int compute(int a, Function<Integer, Integer> function){
    int result = function.apply(a);
    return result;
  }

  public String convert(int a, Function<Integer, String> function){
    return function.apply(a);
  }


//  public void hh(packa<String> test){
//    packa<String> h = new packa<String>() {
//      @Override
//      public void hello(String s) {
//
//      }
//    };
//    h.hello("4");
//  }

  //这是以前的方式，行为先定义好
  public int method1(int a){
    return 2*a;
  }
  public int method2(int a){
    return 5 + a;
  }
  public int method3(int a){
    return a*a;
  }
}
