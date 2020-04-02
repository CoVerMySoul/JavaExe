package LeetCode.Easy;

/**
 * 关于字符串的题
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/2 10:15
 */
public class EasyString {

  public static void main(String[] args) {
    EasyString easyString = new EasyString();
    System.out.println(easyString.CheckPermutation("abc", "bad"));

  }

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
}
