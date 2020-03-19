package com.example.java8.java8.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/12/10 15:04
 */
public class MyFunction {
  public static void main(String[] args) {
    method1();

  }

  /**
   * 排序
   */
  private static void method1() {
    List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
    //倒叙排序
    //方式1
//    Collections.sort(names, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o2.compareTo(o1);
//      }
//    });

    //方式2 Lambda表达式
//    Collections.sort(names, (String o1, String o2) ->{
//      return o2.compareTo(o1);
//    });

    //方式3
    Collections.sort(names, (o1, o2) ->{
      return o2.compareTo(o1);
    });

    //方式n
//    Collections.sort(names, Comparator.reverseOrder());

    System.out.println(names);
  }
}
