package LeetCode.Easy;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/7 21:04
 */
public class Array {
  /**
   * @param nums
   * @return
   */
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] < nums[i]){
          count++;
        }
      }
      result[i] = count;
    }
    return result;
  }

  /**
   * 1394. 找出数组中的幸运数
   * @param arr
   * @return
   */
  public int findLucky(int[] arr) {
    return 0;
  }

  public static void main(String[] args) {
    Array array = new Array();
    int[] ints = array.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
    for (int i = 0; i < ints.length; i++) {
      System.out.println(ints[i]);
    }

  }
}
