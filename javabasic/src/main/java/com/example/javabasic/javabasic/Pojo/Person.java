package com.example.javabasic.javabasic.Pojo;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/11/21 14:01
 */
public class Person{
  private int age;
  private String name;

  public  Person() {

  }
  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public Person(String name) {
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

//  重写equals方法
  @Override
  public boolean equals(Object obj) {
    if (this == obj){
      return true;
    }
    if (obj instanceof Person){
      Person anotherPerson = (Person) obj;
      //比较this和anotherPerson这两个对象的name属性
      if (this.name.equals(anotherPerson.name)){
        return true;
      }
    }
    return false;
  }

  //重写hashCode方法
  @Override
  public int hashCode() {
//    return super.hashCode();
    return this.name.hashCode();
  }
}

