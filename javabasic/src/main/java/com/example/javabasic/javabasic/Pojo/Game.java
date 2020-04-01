package com.example.javabasic.javabasic.Pojo;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/31 14:08
 */
public class Game {
  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
