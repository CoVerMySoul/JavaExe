package com.example.java8.java8.Collector;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @Description: 自定义的收集器
 * @Author: TanBoQiuYun
 * @Date: 2019/12/26 10:48
 */
public class CollectorTest1 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("hello", "world", "welcome");
    test1(list);
  }

  private static void test1(List<String> list) {
    Set<String> collect = list.stream().collect(new MySetCollector<>());
    System.out.println(collect);
//    MySetCollector<String> setCollector = new MySetCollector<>();
//    setCollector.accumulator();
  }
}
