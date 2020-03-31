package com.example.java8.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Description: 关于stream流的练习
 * @Author: TanBoQiuYun
 * @Date: 2019/12/12 15:42
 */
public class StreamTest1 {
  public static void main(String[] args) {
//    waysOfGetStream();
//    theUseOfStream();
//    theUse2OfStream();
    theUse3OfStream();
  }

  private static void theUse3OfStream() {
    List<String> list = Arrays.asList("1", "2", "3", "4");
    list.stream().forEach(i -> System.out.println(i));
  }

  /**
   * 对流更进一步的应用 对整型list里面的每个元素乘以2，然后再求和
   */
  private static void theUse2OfStream() {
    //以前的写法
//    int sum = 0;
//    for (int i = 0; i < ; i++) {
//      sum + = 2 * item
//    }
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    Integer reduce = list.stream().map(i -> i * 2).reduce(0, Integer::sum);
    System.out.println("求和的值：" + reduce);
  }

  /**
   * 流最基本的使用1
   */
  private static void theUseOfStream() {
    IntStream intStream = IntStream.of(new int[]{1, 2, 3});
    intStream.forEach(System.out::println);

    IntStream.range(3, 8).forEach(System.out::println);

    IntStream.rangeClosed(3, 8).forEach(System.out::println);
  }

  /**
   * 得到Stream流的三种方法
   */
  private static void waysOfGetStream() {
    Stream stream1 = Stream.of("hello", "world", "hello world!");

    String[] myArray = new String[]{"hello", "world", "hello world!"};
    Stream stream2 = Stream.of(myArray);

    Stream stream3 = Arrays.stream(myArray);

    //根据集合创建Steam对象
    List<String> list = Arrays.asList("hello", "world", "hello world!");
    Stream<String> stream = list.stream();
  }
}
