package com.example.java8.java8.FunctionalInterface.BigFunction;

import com.example.java8.java8.Pojo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/12/22 19:24
 */
public class BigFunctionTest {
  public static void main(String[] args) {
    Student student1 = new Student("zhangsan", 10);
    Student student2 = new Student("lisi", 90);
    Student student3 = new Student("wangwu", 50);
    List<Student> studentList = Arrays.asList(student1, student2, student3);
//    List<Student> lisi = getStudentByName("lisi", studentList);
//    lisi.forEach(item -> System.out.println(item.getName()));

//    List<Student> studentBySocre = getStudentByScore(30, studentList);
//    studentBySocre.forEach(item -> System.out.println(item.getSocre()));

    getStudentByScore2(30, studentList, (score, list) ->
            list.stream().filter(item -> item.getSocre() > score).collect(Collectors.toList()));

  }

  /**
   * 自定义方法
   * @param score
   * @param students
   * @param biFunction
   * @return
   */
  private static List<Student> getStudentByScore2(int score, List<Student> students, BiFunction<Integer, List<Student>, List<Student>> biFunction) {
    return biFunction.apply(score, students);
  }

  /**
   * 根据名字
   * @param name
   * @param students
   * @return
   */
  private static List<Student> getStudentByName(String name, List<Student> students){
    return students.stream().filter(item -> item.getName().equals(name)).collect(Collectors.toList());
  }

  /**
   * 根据分数
   * @param score
   * @param students
   * @return
   */
  private static List<Student> getStudentByScore(Integer score, List<Student> students){
//    BiFunction<Integer, List<Student>, List<Student>> biFunction = new BiFunction<Integer, List<Student>, List<Student>>() {
//      @Override
//      public List<Student> apply(Integer integer, List<Student> students) {
//        return null;
//      }
//    };
    BiFunction<Integer, List<Student>, List<Student>> biFunction = (myScore, studentList) -> 
       studentList.stream().filter(item -> item.getSocre() > myScore).collect(Collectors.toList());
    return biFunction.apply(score, students);
  }
  
  
}
