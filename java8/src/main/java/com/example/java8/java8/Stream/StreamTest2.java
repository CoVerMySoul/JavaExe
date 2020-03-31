package com.example.java8.java8.Stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: Stream实例刨析以及陷阱刨析
 * @Author: TanBoQiuYun
 * @Date: 2019/12/13 14:10
 */
public class StreamTest2 {

  public static void main(String[] args) {
//    test();
//    test1();
//    test2();
//    test3();
    test6();
  }

  /**
   * 中间操作和终止操作本质的区别
   * 将每个字母首字母大写，其他不变，然后输出
   */
  private static void test6() {
    List<String> list = Arrays.asList("hello", "world", "hello world!");
    System.out.println("--------- 没有问题的代码  ----------");
    list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1))
            .forEach(item -> System.out.println(item));

    System.out.println("--------- 有问题的代码  ----------");
    /*
      以下代码是没有任何输出的，原因就是没有终止操作。
      流是惰性求值的，如果没有终止操作，只有中间操作，那么中间操作是不会执行的

     */
    list.stream().map(item -> {
      String result = item.substring(0, 1).toUpperCase() + item.substring(1);
      System.out.println("测试");
      return result;
    });

  }

  /**
   * 陷阱刨析  —— 流不能重复使用，
   */
  private static void test3() {
    Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);
    System.out.println(stream.limit(2));
    System.out.println(stream.distinct());
  }

  /**
   * Stream.iterate(1, item -> item + 2).limit(6)
   * 1, 3, 5, 7, 9, 11
   * 找出该流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，
   * 然后再取流当中的前两个元素，
   * 最后1、求出流元素中的和 (9+7) = 32
   * 2、求出流中最小的元素
   * 问题：为啥sum()返回的是一个普通int，而max()和min()返回的确是OptionalInt这样一个容器呢？
   * 答案：本质上是取决于这个值可不可能为空，sum()如果没有是返回0，而max和min可能返回为空
   * 进一步问题：同时求出和，最大值，最小值
   */
  private static void test2() {
    int sum = Stream.iterate(1, item -> item + 2).limit(6)
            .filter(item -> item > 2)
            .mapToInt(item -> item * 2)
            .skip(2)
            .limit(2)
            .sum();
    System.out.println("总和：" + sum);

    OptionalInt min = Stream.iterate(1, item -> item + 2).limit(6)
            .filter(item -> item > 2)
            .mapToInt(item -> item * 2)
            .skip(2)
            .limit(2)
            .min();
    System.out.println("最小值：" + min);

    IntSummaryStatistics intSummaryStatistics = Stream.iterate(1, item -> item + 2).limit(6)
            .filter(item -> item > 200)
            .mapToInt(item -> item * 2)
            .skip(2)
            .limit(2)
            .summaryStatistics();
    System.out.println("同时求出和，最小值，最大值：" + intSummaryStatistics);

//    Stream.iterate(1, item -> item + 2).limit(6)
//            .filter(item -> item > 2)
//            .mapToInt(item -> item * 2)
//            .skip(2)
//            .limit(2)
//            .min()
//            .ifPresent(item -> System.out.println(item));
  }

  /**
   * 迭代
   */
  private static void test1() {
    //直接这样使用会无限迭代
//    Stream.iterate(1, item -> item + 2).forEach(System.out::println);
    Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
    System.out.println("---------------------------------------------------");
  }

  private static void test() {
    Stream<String> stream1 = Stream.of("hello", "world", "hello world!");
//    String[] objects = stream1.toArray(length -> new String[length]);
    //将一个流转换成List
    List<String> collect = stream1.collect(Collectors.toList());
  }

}
