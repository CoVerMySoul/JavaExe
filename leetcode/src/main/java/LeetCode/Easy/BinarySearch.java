package LeetCode.Easy;

import java.util.HashSet;

/**
 * 二分查找的题
 * @Author: TanBoQiuYun
 * @Date: 2020/4/1 10:10
 */
public class BinarySearch {
  /**
   * 704. 二分查找
   *
   * @param nums
   * @param target
   * @return
   */
  public int BinarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (nums[middle] == target) {
        return middle;
      } else if (target > nums[middle]) {
        left = middle + 1;
      } else if (target < nums[middle]) {
        right = middle - 1;
      }
    }
    return -1;
  }

  /**
   * 面试题 10.05. 稀疏数组搜索（二分查找）
   *
   * @param words
   * @param s
   * @return
   */
  public int findString(String[] words, String s) {

    return -1;
  }

  /**
   * 35. 搜索插入位置
   * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
   * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
   * @param nums
   * @param target
   * @return
   * [1,3,5,6,8], 6
   */
  public int searchInsert(int[] nums, int target) {
    int right = nums.length - 1;
    int left = 0;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (target == nums[middle]) {
        return middle;
      } else if (target > nums[middle]) {
        left = middle + 1;
      } else if (target < nums[middle]) {
        right = middle - 1;
      }
    }
    //如果没有目标值就插入
    return left;
  }

  /**
   * 主方法——测试
   * @param args
   */
  public static void main(String[] args) {

  }
}
