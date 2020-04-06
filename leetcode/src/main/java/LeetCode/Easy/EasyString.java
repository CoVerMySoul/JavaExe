package LeetCode.Easy;

/**
 * 关于字符串的题
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/2 10:15
 */
public class EasyString {

  /**
   * 1108. IP 地址无效化
   * 输入：address = "1.1.1.1"
   * 输出："1[.]1[.]1[.]1"
   * @param address
   * @return
   */
  public String defangIPaddr(String address) {

    //方式1
//    return address.replaceAll("\\.", "[.]");
    //方式2
//    return address.replace(".", "[.]");
    //方式3
    StringBuilder newStr = new StringBuilder();
    for (int i = 0; i < address.length(); i++) {
      if (address.charAt(i) == '.'){
        newStr.append("[.]");
        continue;
      }
      newStr.append(address.charAt(i));
    }
    return newStr.toString();
  }

  /**
   * 804. 唯一摩尔斯密码词
   * @param words
   * @return
   */
  public int uniqueMorseRepresentations(String[] words) {
    return 0;
  }

  /**
   * 1370. 上升下降字符串
   * @param s
   * @return
   */
  public String sortString(String s) {
    return "0";
  }

  /**
   * 面试题 01.02. 判定是否互为字符重排
   * abb，aab
   * @param s1
   * @param s2
   * @return
   */
  public boolean CheckPermutation(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;
    //如果长度相等，就两个字符串按照大小排序
    String newStrS1 = stringSort(s1);
    String newStrS2 = stringSort(s2);
    return newStrS1.equals(newStrS2);
  }

  /**
   * 将字符串按照ASCII升序排序
   * @param str
   * @return
   */
  private String stringSort(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length -1; i++) {
      for (int j = 0; j <  chars.length -i -1; j++) {
        if (chars[j] > chars[j+1]){
          char temp = chars[j];
          chars[j] = chars[j+1];
          chars[j+1] = temp;
        }
      }
    }
    return new String(chars);
  }

  /**
   * 657. 机器人能否返回原点
   * 解题思路：只要上和下相等且左和右相等
   * @param moves
   * @return
   */
  public boolean judgeCircle(String moves) {
    char[] chars = moves.toCharArray();
    int x = 0;
    int y = 0;
    for (char ch : chars) {
      switch (ch){
        case 'U':x++;break;
        case 'D':x--;break;
        case 'L':y++;break;
        case 'R':y--;break;
      }
    }
    return x == 0 && y ==0;
  }

  /**
   * 1309. 解码字母到整数映射
   * @param s
   * @return
   */
  public String freqAlphabets(String s) {
    return null;
  }

  /**
   * 551. 学生出勤记录 I
   * @param s
   * @return
   */
  public boolean checkRecord(String s) {
    int countA = 0;
    for (int i = 0; i < s.length() && countA <=1; i++){
      if (s.charAt(i) == 'A'){
        countA++;
      }
    }
    return countA <=1 && !s.contains("LLL");
  }

  public static void main(String[] args) {
    EasyString easyString = new EasyString();
    System.out.println(easyString.checkRecord("PPALLL"));
  }
}
