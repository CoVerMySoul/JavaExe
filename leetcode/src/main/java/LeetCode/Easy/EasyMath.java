package LeetCode.Easy;

/**
 * 一些数学题
 * @Author: TanBoQiuYun
 * @Date: 2020/4/6 22:12
 */
public class EasyMath {
  /**
   * 面试题17. 打印从1到最大的n位数
   * @param n
   * @return
   */
  public int[] printNumbers(int n) {
    int pow = (int)(Math.pow(10, n) - 1);
    int[] result = new int[pow];
    for (int i = 1; i <= pow; i++) {
      result[i-1] = i;
    }
    return result;
  }

  /**
   * 1295. 统计位数为偶数的数字
   * nums = [12,345,2,6,7896]
   * @param nums
   * @return
   */
  public int findNumbers(int[] nums) {
    int evenCount = 0;
    for (int i = 0; i < nums.length; i++) {
      int countW = 0;
      int num = nums[i];
      while (num >= 1){
        num = num / 10;
        countW++;
      }
      if (countW % 2 == 0){
        evenCount++;
      }
    }
    return evenCount;
  }

  /**
   * 1342. 将数字变成 0 的操作次数
   * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。
   * 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
   * @param num
   * @return
   */
  public int numberOfSteps (int num) {
    int countStep = 0;
    while (num != 0){
      if (num % 2 == 0){
        num = num / 2;
        countStep ++;
      }else {
        num = num - 1;
        countStep ++;
      }
    }
    return countStep;
  }

  public static void main(String[] args) {
    EasyMath math = new EasyMath();
    System.out.println(math.printNumbers(1));
  }
}
