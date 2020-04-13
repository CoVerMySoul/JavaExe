package com.example.javabasic.javabasic.Enums;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/11 10:20
 */
public enum Day {
  //描述了当前类的7个对象
  monday("周一", 1),tuesday,wedesday,friday,saturday,sunday;

  private String name;
  private int index;

  private Day(){

  }
  private Day(String name, int index){
    this.name = name;
    this.index = index;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
