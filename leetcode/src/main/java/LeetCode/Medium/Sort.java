package LeetCode.Medium;

/**
 * @Decprition:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/1 10:13
 */
public class Sort {
  /**
   * 912. 排序数组(冒泡排序)
   * 给定一个整数数组 nums，将该数组升序排列。
   * {10, 5, 7, 1, 8, 0}
   *
   * @param nums
   * @return
   */
  public int[] sortArray(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    return nums;
  }

  /**
   * 快速排序(还没有写完)
   * {10,7,2,4,7,62,3,4,2,1,8,9,19};
   *
   * @param nums
   */
  public void quickSort(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    int temp = nums[low];
    while (low < high) {
      while (temp <= nums[high] && low < high) {
        high--;
      }
      while (temp >= nums[high] && low < high) {
        low++;
      }
      if (low < high) {
        int t = nums[low];
        nums[low] = nums[high];
        nums[high] = t;
      }
    }
  }

  /**
   * 主方法——测试
   * @param args
   */
  public static void main(String[] args) {

  }
}
