package com.example.java8.java8.Pojo;

/**
 * @Description: 第二种方法引用
 * @Author: TanBoQiuYun
 * @Date: 2019/12/16 14:37
 */
public class StudentComparator {
  //第2种方法引用
  public  int compareStudentByScore(Student student1, Student student2){
    return student1.getSocre() - student2.getSocre();
  }
  //字符串比较，忽略大小写,按照字母升序排序
  public  int compareStudentByName(Student student1, Student student2){
    return student1.getName().compareToIgnoreCase(student2.getName());
  }
}
