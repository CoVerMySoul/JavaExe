package com.example.javabasic.javabasic.Collections;

import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @Description: 关于集合Set的练习
 * @Author: TanBoQiuYun
 * @Date: 2019/12/24 13:10
 */
public class SetsExe {
  public static void main(String[] args) {
    Set set = new HashSet();
    List list = new ArrayList();
    List list1 = new LinkedList();
    test1();
  }

  private static void test1() {
    //集合取交集
    HashSet<Integer> set1 = Sets.newHashSet(1, 2, 3, 4, 5);
    HashSet<Integer> set2 = Sets.newHashSet(4, 5, 6, 7, 8);
    Sets.SetView<Integer> intersection = Sets.intersection(set1, set2);
    System.out.println(intersection);
  }
}
