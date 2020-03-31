package com.example.javabasic.javabasic.Pojo;

import lombok.Data;

/**
 * 描述：
 *
 * @author: TanBoQiuYun
 * @date: 2019/10/24 15:47
 */
@Data
public class User {
  private String username;
  private int score;
  private int age;


  public User(String username, int score, int age) {
    this.username = username;
    this.score = score;
    this.age = age;
  }

  public User() {

  }
}
