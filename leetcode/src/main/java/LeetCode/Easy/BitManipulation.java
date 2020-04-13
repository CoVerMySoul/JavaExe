package LeetCode.Easy;

/**
 * 位运算的题
 * @Author: TanBoQiuYun
 * @Date: 2020/4/11 22:00
 */
public class BitManipulation {

  /**
   * 461. 汉明距离
   * 将x，y按位异或得到i，将问题转化为求i的二进制位中1的个数count
   * @param x
   * @param y
   * @return
   */
  public int hammingDistance(int x, int y) {
    int number = x ^ y;
    int count = 0;
    while (number != 0){
      if ((number & 1) == 1){
        count++;
      }
      number = number >> 1;
    }
    return count;
  }

  /**
   * 面试题15. 二进制中1的个数，要求把数字 n 看作无符号数
   * >>> :无符号右移
   * @param n
   * @return
   */
  public int hammingWeight(int n) {
    int count = 0;
    while (n != 0){
      if ((n & 1) == 1){
        count++;
      }
      n = n >>> 1;
    }
    return count;
  }

  /**
   * 371. 两整数之和
   * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
   * @param a
   * @param b
   * @return
   */
  public int getSum(int a, int b) {
    while (b != 0){
      // 当进位不为0时
      // 无进位累加值
      int temp = a ^ b;
      //进位值
      int carry = (a & b) << 1;

      // a=无进位累加值 b=进位值
      a = temp;
      b = carry;
    }
    return a;
  }

  /**
   * 主方法——测试
   * @param args
   */
  public static void main(String[] args) {
    BitManipulation bitManipulation = new BitManipulation();
    System.out.println(bitManipulation.hammingWeight(11));
  }
}
