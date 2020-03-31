package com.example.javabasic.javabasic.Test;

import com.example.javabasic.javabasic.Pojo.Student;

/**
 * 测试
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/3/27 17:16
 */
public class TestMain {
  public static void main(String[] args) {
    Class<Student> studentClass = Student.class;
    Student student = new Student("1", 20);
    Class<? extends Student> aClass = student.getClass();
  }
}
