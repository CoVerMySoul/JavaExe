package com.example.javabasic.javabasic.LeetCode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/1/16 15:08
 */
public class ArrayExe extends Object {
  public static void main(String[] args) {
    int[] array1 = new int[]{4, 0, 9, 7, 5};
    EasyQuestions easyQuestions = new EasyQuestions();
//    System.out.println(easyQuestions.getSum(33, 1));
    MediumQuestions mediumQuestions = new MediumQuestions();
    mediumQuestions.sortArray(array1);
  }

}
