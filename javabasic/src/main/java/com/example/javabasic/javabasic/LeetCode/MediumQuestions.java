package com.example.javabasic.javabasic.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 难度为中等的
 * @Author: TanBoQiuYun
 * @Date: 2020/1/17 11:21
 */
public class MediumQuestions {
  /**
   * 给定一个无重复元素的数组 candidates 和一个目标数 target ，
   * 找出 candidates 中所有可以使数字和为 target 的组合。
   * @param candidates
   * @param target
   * @return
   */
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    return null;
  }

  /**
   * 912. 排序数组(冒泡排序)
   * 给定一个整数数组 nums，将该数组升序排列。
   * {10, 5, 7, 1, 8, 0}
   * @param nums
   * @return
   */
  public List<Integer> sortArray(int[] nums) {
    List<Integer> list = new ArrayList<>(nums.length);
    for (int i = 0; i < nums.length -1; i++) {
      for (int j = 0; j < nums.length - i -1; j++) {
        if (nums[j] > nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }
    for (int num:nums) {
      list.add(num);
    }
    return list;
  }

  /**
   * 快速排序(还没有写完)
   * {10,7,2,4,7,62,3,4,2,1,8,9,19};
   * @param nums
   */
  public void quickSort(int[] nums){
    int low = 0;
    int high = nums.length -1;
    int temp = nums[low];
    while (low < high){
      while (temp <= nums[high] && low < high){
        high--;
      }
      while (temp >= nums[high] && low < high){
        low++;
      }
      if (low < high){
        int t = nums[low];
        nums[low] = nums[high];
        nums[high] = t;
      }
    }
  }
}
