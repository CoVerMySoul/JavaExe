package com.example.java8.java8.MethodReference;

import com.example.java8.java8.Pojo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Description: 4类方法引用
 * @Author: TanBoQiuYun
 * @Date: 2019/12/13 14:42
 */
public class MethodReferenceTest1 {
  public static void main(String[] args) {
//    List<String> list = Arrays.asList("hello", "world", "hello world!");
//    可以理解为下面这两种方式所实现的功能其实一样的，完全等价，但是方法引用的方式更简洁
//    list.forEach(item -> System.out.println(item));
//    list.forEach(System.out::println);

    //根据name和score来进行排序
    methodReference();
  }

  private static void methodReference() {
    Student student1 = new Student("zhangsan", 10);
    Student student2 = new Student("lisi", 90);
    Student student3 = new Student("wangwu", 50);
    Student student4 = new Student("zhaoliu", 40);

    List<Student> studentList = Arrays.asList(student1, student2, student3, student4);

    //jdk8以前传统的排序方法
//    Collections.sort();
//    Collections.sort(studentList, (studentParma1, studentParam2) ->
//            Student.compareStudentByScore(studentParma1,studentParam2));
//    studentList.sort((studentParma1, studentParam2) ->
//            Student.compareStudentByScore(studentParma1,studentParam2));


//    studentList.sort(Student::compareStudentByScore);
//    studentList.forEach(item -> System.out.println(item.getSocre()));


//        studentList.sort((studentParma1, studentParam2) ->
//            Student.compareStudentByName(studentParma1,studentParam2));
//        studentList.forEach(item -> System.out.println(item.getName()));
    //第2种方式f'g
//    StudentComparator studentComparator = new StudentComparator();
//    studentList.sort(studentComparator::compareStudent
    //第3种方式
//    studentList.sort(Student::compareByScore);
//    studentList.forEach(item -> System.out.println(item.getSocre()));

    //构造方法引用（constructor references）：类名：：new
    MethodReferenceTest1 methodReferenceTest = new MethodReferenceTest1();
    System.out.println(methodReferenceTest.getMyString(String::new));

    System.out.println(methodReferenceTest.getMyString("hello", String::new));
  }

  public String getMyString(Supplier<String> supplier) {
    return supplier.get() + "myTest";
  }

  public String getMyString(String str, Function<String, String> function) {
    return function.apply(str);
  }
}
