package com.example.javabasic.javabasic.Objects;

import com.example.javabasic.javabasic.Pojo.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Description: 关于Objects工具类的测试
 * @Author: TanBoQiuYun
 * @Date: 2019/12/26 11:05
 */
public class ObjectsTest {
  public static void main(String[] args) {
    Student student1 = new Student("zhangsan", 10);
    Student student2 = new Student("lisi", 90);
    Student student3 = new Student("wangwu", 50);
    Student student4 = new Student("zhaoliu", 40);

    List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
    List<Student> x = null;
    test1(x);
  }

  private static void test1(List<Student> studentList) {
//    List<Student> students = Objects.requireNonNull(studentList);
    boolean b = Objects.nonNull(studentList);
    Objects.requireNonNull(studentList, "当前学生信息为空哦");
  }
}
