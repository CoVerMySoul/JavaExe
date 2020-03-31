package com.example.java8.java8.Java8;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 关于lambda表达式的练习, 使用举例
 * @Author: TanBoQiuYun
 * @Date: 2019/11/21 16:09
 */
public class LambdaTest {

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    //方法引用的方式
    integerList.forEach(System.out::println);
//    //内部迭代
//    integerList.forEach(new Consumer<Integer>() {
//      //匿名内部类
//      @Override
//      public void accept(Integer integer) {
//        System.out.println(integer);
//      }
//    });
//    integerList.forEach((Integer integer) -> {
//      System.out.println(integer);
//    });


  }

}
