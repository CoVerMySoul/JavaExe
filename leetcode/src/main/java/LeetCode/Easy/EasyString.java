package LeetCode.Easy;

/**
 * 关于字符串的题
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/2 10:15
 */
public class EasyString {

  /**
   * 242. 有效的字母异位词
   * 字母异位词指：字母异位词是指由相同的字母按照不同的顺序组成的单词，
   *
   * @param s
   * @param t
   * @return
   */
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    char[] chars1 = charSort(s);
    char[] chars2 = charSort(t);
    String str1 = new String(chars1);
    String str2 = new String(chars2);
    return str1.equals(str2);
  }


  /**
   * 面试题58 - I. 翻转单词顺序
   *
   * @param s
   * @return
   */
  public String reverseWordsI(String s) {
    String[] s1 = s.trim().split(" ");
    StringBuilder newStr = new StringBuilder();
    int begin = 0;
    int end = s1.length - 1;
    while (begin < end) {
      String temp = s1[begin];
      s1[begin] = s1[end];
      s1[end] = temp;
      begin++;
      end--;
    }
    for (int i = 0; i < s1.length; i++) {
      if (s1[i].length() != 0) {
        newStr.append(s1[i]);
        if (i != s1.length - 1) {
          newStr.append(" ");
        }
      }
    }
    return newStr.toString();
  }

  /**
   * 面试题 01.06. 字符串压缩
   * "aabcccccaaa"
   *
   * @param S
   * @return
   */
  public String compressString(String S) {
    if (S == null || S.length() == 0)
      return "";
    StringBuilder stringBuilder = new StringBuilder();
    char ch = S.charAt(0);
    int count = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == ch) {
        count++;
      } else {
        stringBuilder.append(ch).append(count);
        count = 1;
        ch = S.charAt(i);
      }
    }
    stringBuilder.append(ch).append(count);
    return stringBuilder.length() < S.length() ? stringBuilder.toString() : S;
  }


  /**
   * 面试题58 - II. 左旋转字符串
   *
   * @param s
   * @param n
   * @return
   */
  public String reverseLeftWords(String s, int n) {
    String leftStr = s.substring(0, n);
    String rightStr = s.substring(n);
    //需要把leftStr反转
    char[] chars = leftStr.toCharArray();
    int begin = 0;
    int end = leftStr.length() - 1;
    while (begin < end) {
      char temp = chars[begin];
      chars[begin] = chars[end];
      chars[end] = temp;
      begin++;
      end--;
    }
    String s1 = new String(chars);
    return rightStr + s1;
  }

  /**
   * 统计字符串中的单词数（有问题）
   * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
   *
   * @param s
   * @return
   */
  public static int countSegments(String s) {
    int count = 0;
    boolean isBlank = true;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        isBlank = true;
      } else {
        //如果当前字符不是空格
        if (isBlank) {
          count++;
        }
        isBlank = false;
      }
    }
    return count;
  }

  /**
   * 125. 验证回文串
   * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
   * 说明：本题中，我们将空字符串定义为有效的回文串。
   *
   * @param s
   * @return
   */
  public boolean isPalindrome(String s) {
    if (s.length() <= 0) {
      return true;
    }
    //首先将字母全部过滤出来，然后全部转换为大写或者小写，然后再比较首尾
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
              || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
        str.append(s.charAt(i));
      }
    }
    String newStr = str.toString().toLowerCase();
    return checkIsPalindrome(newStr);
  }

  private boolean checkIsPalindrome(String str) {
    int len = str.length();
    int beginIndex = 0;
    int endIndex = len - 1;
    while (beginIndex < endIndex) {
      if (str.charAt(beginIndex) != str.charAt(endIndex)) {
        return false;
      }
      beginIndex++;
      endIndex--;
    }
    return true;
  }
  /**
   * 520. 检测大写字母(有问题)
   * 当第一个字符是大写时，后面的所有字符必须一致(都是大写，或者都是小写)
   * 第一个字符不是大写时，整个字符串必须一致(都是小写)
   *
   * @param word
   * @return
   */
  public boolean detectCapitalUse(String word) {
    char[] chars = word.toCharArray();
    boolean flag = false;
    if (chars.length <= 1)
      flag = true;
    //如果第一个字母是大写,就判断剩下的是不是全部是大写或者全部是小写
    if (chars[0] >= 'A' && chars[0] <= 'Z') {
      //判断剩下的是不是全部是大写或者全部是小写
      String substring = word.substring(1);
      boolean equals1 = substring.toUpperCase().equals(substring);
      boolean equals2 = substring.toLowerCase().equals(substring);
      if (equals1 || equals2) {
        flag = true;
      }
    } else {//如果第一个字母不是大写，就判断剩下的是不是全部是小写
      for (int j = 1; j < chars.length; j++) {
        if (chars[0] >= 'a' && chars[0] <= 'z') {
          flag = true;
          continue;
        } else {
          flag = false;
          break;
        }
      }
    }
    return flag;
  }

  /**
   * 709. 转换成小写字母
   * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
   *
   * @param str
   * @return
   */
  public String toLowerCase(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= 'A' && chars[i] <= 'Z') {
        chars[i] = (char) (32 + chars[i]);
      }
    }
    return new String(chars);
  }

  /**
   * 反转字符串
   *
   * @param s
   */
  private static void reverseString(char[] s) {
    int begin = 0;
    int end = s.length - 1;
    while (begin < end) {
      swap(s, begin, end);
      begin++;
      end--;
    }
  }

  private static void swap(char[] s, int begin, int end) {
    char temp = s[begin];
    s[begin] = s[end];
    s[end] = temp;
  }

  /**
   * 面试题 01.03. URL化
   *
   * @param S
   * @param length
   * @return
   */
  public String replaceSpaces(String S, int length) {
    StringBuilder newStr = new StringBuilder();
    for (int i = 0; i < length; i++) {
      if (S.charAt(i) == ' ') {
        newStr.append("%20");
      } else {
        newStr.append(S.charAt(i));
      }
    }
    return newStr.toString();
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

  /**
   * 面试题05. 替换空格
   *
   * @param s
   * @return
   */
  public String replaceSpace(String s) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' '){
        str.append("%20");
      }else {
        str.append(s.charAt(i));
      }
    }
    return str.toString();
  }


  /**
   * @param astr
   * @return
   */
  public boolean isUnique(String astr) {
    char[] chars = charSort(astr);
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i+1])
        return false;
    }
    return true;
  }

  /**
   * 对字符串进行排序
   * @param str
   * @return
   */
  private char[] charSort(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      for (int j = 0; j < chars.length - i - 1; j++) {
        if (chars[j] > chars[j + 1]) {
          char temp = chars[j];
          chars[j] = chars[j + 1];
          chars[j + 1] = temp;
        }
      }
    }
    return chars;
  }

  /**
   * 459. 重复的子字符串
   * @param s
   * @return
   */
  public boolean repeatedSubstringPattern(String s) {
    return true;
  }

  /**
   * 859. 亲密字符串
   *
   * @param A
   * @param B
   * @return
   */
  public boolean buddyStrings(String A, String B) {
    return true;
  }

  /**
   * 824. 山羊拉丁文
   *
   * @param str
   * @return
   */
  public String toGoatLatin(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {

      }
    }

    return null;
  }

  /**
   * 主方法——测试
   * @param args
   */
  public static void main(String[] args) {
    EasyString easyString = new EasyString();
    System.out.println(easyString.isUnique("letcod"));
  }
}
