package LeetCode.Easy;

import java.util.Arrays;

/**
 * 一些数学题
 * @Author: TanBoQiuYun
 * @Date: 2020/4/6 22:12
 */
public class EasyMath {

  /**
   * 771. 宝石与石头
   * @param J
   * @param S
   * @return
   */
  public int numJewelsInStones(String J, String S) {
    int count = 0;
    char[] chars = J.toCharArray();
    for(char ch : chars){
      for (int i = 0; i<S.length(); i++){
        if (ch == S.charAt(i)){
          count++;
        }
      }
    }
    return count;
  }

  /**
   * 258. 各位相加
   *
   * @param num
   * @return
   */
  public int addDigits(int num) {
    int total = 0;
    while (num > 0) {
      int yushu = num % 10;
      total += yushu;
      num = num / 10;
    }
    if (total >= 10) {
      total = addDigits(total);
    }
    return total;
  }

  /**
   * 1281. 整数的各位积和之差
   *
   * @param n
   * @return 286
   */
  public int subtractProductAndSum(int n) {
    int add = 0, mul = 1;
    while (n > 0) {
      int yushu = n % 10;
      add += yushu;
      mul *= yushu;
      n = n / 10;
    }
    return mul - add;
  }

  /**
   * 485. 最大连续1的个数
   * 给定一个二进制数组， 计算其中最大连续1的个数。
   * [1,1,0,1,1,1]
   *
   * @param nums
   * @return
   */
  public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
        if (count >= maxCount) {
          maxCount = count;
        }
      } else {
        count = 0;
      }
    }
    return maxCount;
  }

  /**
   * 1189.“气球” 的最大数量
   * balloon
   *
   * @param text
   * @return
   */
  public int maxNumberOfBalloons(String text) {
    int countB = 0;
    int countA = 0;
    int countL = 0;
    int countO = 0;
    int countN = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == 'b') {
        countB++;
      }
      if (text.charAt(i) == 'a') {
        countA++;
      }
      if (text.charAt(i) == 'l') {
        countL++;
      }
      if (text.charAt(i) == 'o') {
        countO++;
      }
      if (text.charAt(i) == 'n') {
        countN++;
      }
    }
    countL = countL / 2;
    countO = countO / 2;
    int[] array = {countA, countB, countL, countN, countO};
    Arrays.sort(array);
    return array[0];
  }


  /**
   * 两数之和
   *
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    int[] index = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          index[0] = i;
          index[1] = j;
          break;
        }
      }
    }
    return index;
  }
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

  /**
   * 1185. 一周中的第几天
   *
   * @param day
   * @param month
   * @param year
   * @return
   */
  public String dayOfTheWeek(int day, int month, int year) {
    return null;
  }

  /**
   * 414. 第三大的数
   * 注意，要求返回第三大的数，是指第三大且唯一出现的数。
   *
   * @param nums
   * @return
   */
  public int thirdMax(int[] nums) {
    int first = 0;
    int second = 0;
    int third = 0;
    for (int i = 0; i < nums.length; i++) {

    }
    return 0;
  }

  /**
   * 主方法——测试
   * @param args
   */
  public static void main(String[] args) {
    EasyMath math = new EasyMath();
    System.out.println(math.printNumbers(1));
  }
}
