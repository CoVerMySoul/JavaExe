package LeetCode.Easy;

/**
 * @Description: 关于排序
 * @Author: TanBoQiuYun
 * @Date: 2020/4/1 10:17
 */
public class Sort {

  /**
   * 面试题53 - I. 在排序数组中查找数字
   *
   * @param nums
   * @param target
   * @return
   */
  public int search(int[] nums, int target) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        count++;
      }
    }
    return count;
  }

}
