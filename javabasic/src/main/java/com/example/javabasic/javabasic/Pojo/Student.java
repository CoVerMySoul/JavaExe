package com.example.javabasic.javabasic.Pojo;


import java.io.Serializable;

/**
 * 描述：学生实体类
 *
 * @author: TanBoQiuYun
 * @date: 2019/10/24 11:41
 */

public class Student implements Serializable {
  private String name;
  private int socre;

  public Student(String name, int socre) {
    this.name = name;
    this.socre = socre;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSocre() {
    return socre;
  }

  public void setSocre(int socre) {
    this.socre = socre;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", socre=" + socre +
            '}';
  }

  //第一种方法引用
  public static int compareStudentByScore(Student student1, Student student2) {
    return student1.getSocre() - student2.getSocre();
  }

  //字符串比较，忽略大小写,按照字母升序排序
  public static int compareStudentByName(Student student1, Student student2) {
    return student1.getName().compareToIgnoreCase(student2.getName());
  }


  public int compareByScore(Student student) {
    return this.getSocre() - student.getSocre();
  }

  public int compareByName(Student student) {
    return this.getName().compareToIgnoreCase(student.getName());
  }
}
