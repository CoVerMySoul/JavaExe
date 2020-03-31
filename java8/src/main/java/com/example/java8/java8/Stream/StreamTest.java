package com.example.java8.java8.Stream;

import com.example.java8.java8.Pojo.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Description: 流的一些测试
 * @Author: TanBoQiuYun
 * @Date: 2019/12/19 16:41
 */
public class StreamTest {
  public static void main(String[] args) {
    Student student1 = new Student("zhangsan", 10);
    Student student2 = new Student("lisi", 90);
    Student student3 = new Student("wangwu", 50);
    Student student4 = new Student("zhaoliu", 40);
    List<Student> studentList = Arrays.asList(student1, student2, student3, student4);

//    test1(studentList);
    test2(studentList);
  }

  /**
   * 测试2
   *
   * @param studentList
   */
  private static void test2(List<Student> studentList) {
    Predicate<Student> x = new Predicate<Student>() {
      @Override
      public boolean test(Student student) {
        if (student.getSocre() >= 50) {
          return true;
        }
        return false;
      }
    };
    //filter()用来判断里面的条件是真还是假？如果是假，就从流当中过滤掉；如果是真，就继续放到流当中，供后续操作使用
    List<Student> collect = studentList.stream().filter(item -> item.getSocre() >= 50).collect(Collectors.toList());
    collect.forEach(item -> System.out.println(item.getSocre()));
  }

  /**
   * 测试1
   *
   * @param studentList
   */
  private static void test1(List<Student> studentList) {
    List<String> collect = studentList.stream().map(Student::getName).collect(Collectors.toList());

    List<Student> collect1 = studentList.stream().sorted(Comparator.comparing(Student::getSocre)).collect(Collectors.toList());
    collect1.forEach(item -> {
      System.out.println(item.getSocre());
    });

    studentList.stream().sorted();
  }
}
