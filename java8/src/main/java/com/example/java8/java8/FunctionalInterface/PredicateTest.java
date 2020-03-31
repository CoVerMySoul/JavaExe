package com.example.java8.java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Description: 给定一个参数，判断这个参数是不是符合某一个条件
 * @Author: TanBoQiuYun
 * @Date: 2019/12/20 14:49
 */
public class PredicateTest {

  public static void main(String[] args) {


//    predicateTest1();
    predicateTest2();

  }

  /**
   * 第2次练习
   */
  private static void predicateTest2() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //1、找到集合里面所有的奇数
//    list.stream().filter(num -> {
//      if (num % 2 == 0){
//        return false;
//      }
//      return true;
//    }).collect(Collectors.toList()).forEach(item -> System.out.println("奇书："+item));
//    //2、找到集合里面大于5的数
//    list.stream().filter(number -> number > 5).collect(Collectors.toList())
//            .forEach(item -> System.out.println(item));
    //3、找到集合里面所有的偶数
    coditionFilter(list, num -> num % 2 == 0);
  }

  private static void coditionFilter(List<Integer> list, Predicate<Integer> predicate) {
    for (Integer number : list) {
      if (predicate.test(number)) {
        System.out.println(number);
      }
    }
  }

  /**
   * 第一次练习
   */
  private static void predicateTest1() {
    Predicate<String> predicate = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return false;
      }
    };

    Predicate<String> predicate1 = item -> {
      if (item.equals("tb")) {
        return true;
      } else {
        return false;
      }
    };
    System.out.println(predicate1.test("tb123"));


  }

}
