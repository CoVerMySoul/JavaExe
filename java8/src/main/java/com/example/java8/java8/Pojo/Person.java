package com.example.java8.java8.Pojo;

import java.util.Objects;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/11/21 14:01
 */
public class Person {
  private int age = 20;
  private String name = "张三";

  public Person() {

  }

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

