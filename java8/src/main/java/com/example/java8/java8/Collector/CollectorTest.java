package com.example.java8.java8.Collector;

import com.example.java8.java8.Pojo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: Collector源码分析与收集器核心
 * @Author: TanBoQiuYun
 * @Date: 2019/12/24 14:49
 */
public class CollectorTest {
  public static void main(String[] args) {
    Student student1 = new Student("zhangsan", 10);
    Student student2 = new Student("lisi", 90);
    Student student3 = new Student("wangwu", 50);
    Student student4 = new Student("zhaoliu", 40);

    List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
    test1(studentList);
    test2();
  }

  /**
   *
   */
  private static void test2() {
    MySetCollector<String> mySetCollector = new MySetCollector<>();
  }

  /**
   * 第一个
   *
   * @param studentList
   */
  private static void test1(List<Student> studentList) {
    System.out.println();
    List<Student> collect = studentList.stream().collect(Collectors.toList());
    collect.forEach(System.out::println);

    System.out.println("count：" + studentList.stream().collect(Collectors.counting()));
    System.out.println("stream自己的count：" + studentList.stream().count());
  }
}
