package com.example.javabasic.javabasic.Collections;

import java.util.ArrayList;

/**
 * @Description: 集合
 * @Author: TanBoQiuYun
 * @Date: 2019/11/29 11:17
 */
public class SetAndList {

  public static void main(String[] args) {

//    ListExe();

  }

  /**
   * 关于java的list集合的练习
   */
  private static void ListExe() {

    ArrayList<String> arrayList = new ArrayList<String>();
//    arrayList.sort();

    ArrayList<Integer> integerList = new ArrayList<Integer>();
    integerList.add(10);
    integerList.add(20);
    integerList.add(30);
    integerList.add(40);
    integerList.add(50);
    Object[] objects = integerList.toArray();

    Integer[] array = new Integer[integerList.size()];
    integerList.toArray(array);
    for (Integer x:array) {
      System.out.println(x);
    }
  }

  private void  test1(String parm1){

  }
  private void test2(Integer parm2){

  }
}
