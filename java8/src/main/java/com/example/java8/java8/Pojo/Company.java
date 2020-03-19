package com.example.java8.java8.Pojo;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/12/6 15:47
 */
@Data
public class Company {
  private String name;
  private List<User> userList;
}
