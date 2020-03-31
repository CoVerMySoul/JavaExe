package com.example.java8.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 流的短路与并发流
 * 可以把流想象成这样，流里面有一个容器，容器里面存放的是对每一个元素的操作，所以流里面存放的是这些操作
 * 所以对这些流进行处理的时候，他会拿到流里面的所有操作应用到每个元素，并且会将这些操作串行化。（意思就是对遍历的每个元素
 * 应用流里面的所有操作，而不是）
 * 对第一个元素应用第一个操作，应用第二个操作，应用第三个操作这样
 * 这些操作里面还存在逻辑规则——短路（比如操作符 && ||）所以流是存在短路运算的（只要找到符合运算的，后面的就都不会去
 * 执行了）
 * @Author: TanBoQiuYun
 * @Date: 2019/12/23 10:28
 */
public class StreamTest3 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("hello", "world", "hello world!");
//    Optional<String> first = list.stream().filter(item -> item.length() == 5).findFirst();
//    System.out.println(first.get());
//    test1(list);
    test2();
  }

  /**
   * 找出所有单词并且去重,所以输出的结果是hello，welcome, world
   */
  private static void test2() {
    List<String> list = Arrays.asList("hello welcome", "world hello", "hello world hello", "hello welcome");
//    list.stream().map(item -> item.split("")).distinct().collect(Collectors.toList());
    list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream)
            .distinct().collect(Collectors.toList())
            .forEach(System.out::println);
  }

  /**
   * 打印列表长度为5的第一个单词
   *
   * @param list
   */
  private static void test1(List<String> list) {
    list.stream().mapToInt(item -> {
      int length = item.length();
      System.out.println("此元素:" + item);
      return length;
    }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
  }


}
