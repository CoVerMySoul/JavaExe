package LeetCode.Easy;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/6 22:12
 */
public class Math {
  public int[] printNumbers(int n) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      stringBuilder.append("9");
    }
    String str = stringBuilder.toString();

    return new int[1];
  }

  public static void main(String[] args) {
    Math math = new Math();
    math.printNumbers(3);
  }
}
