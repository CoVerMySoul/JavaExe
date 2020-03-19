package com.example.javabasic.javabasic.Utils;

/**
 * 如果实现了接口，就必须要不接口里面得抽象方法全部实现
 * @Author: TanBoQiuYun
 * @Date: 2020/1/9 16:30
 */
public class LinkedBox extends AbstractBox{
  public boolean add(int element) {
    return false;
  }

  public int get(int index) {
    //判断下标是否合法
    return 0;
  }

  public int remove(int index) {
    //判断下标是否合法
    return 0;
  }

  public int size() {
    return 0;
  }
}
