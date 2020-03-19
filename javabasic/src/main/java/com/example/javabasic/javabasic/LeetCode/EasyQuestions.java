package com.example.javabasic.javabasic.LeetCode;

import com.example.javabasic.javabasic.BinaryTree.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 难度为简单的
 * 需要考虑时间复杂度和空间复杂度
 * @Author: TanBoQiuYun
 * @Date: 2020/1/16 17:28
 */
public class EasyQuestions {

  /**
   * 给定一个整数数组，判断是否存在重复元素。
   * @param nums
   * @return true 包含重复 false不包含重复
   */
  private static boolean containsDuplicate(int[] nums) {
//    Arrays.sort(nums);
//    for (int i = 0; i < nums.length -1; i++) {
//      if (nums[i] == nums[i+1]){
//        return true;
//      }
//    }
//    return false;
    HashSet<Integer> set = new HashSet<>(nums.length);
    for(int num : nums){
      if (set.contains(num)){
        return true;
      }
      set.add(num);
    }
    return false;
  }

  /**
   * 反转字符串
   * @param s
   */
  private static void reverseString(char[] s) {
    int begin =0;
    int end = s.length-1;
    while (begin < end){
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
   * 两数之和
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    int[] index = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length ; j++) {
        if (nums[i] + nums[j] == target){
          index[0] = i;
          index[1] =j;
          break;
        }
      }
    }
    return index;
  }

  /**
   * 20. 有效的括号
   * @param s
   * @return
   */
  public boolean isValid(String s) {
    return true;
  }

  /**
   * 709. 转换成小写字母
   * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
   * @param str
   * @return
   */
  public String toLowerCase(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= 'A' && chars[i]  <= 'Z'){
        chars[i]=  (char) (32 + chars[i]);
      }
    }
    return new String(chars);
  }

  /**
   * 520. 检测大写字母(有问题)
   * 当第一个字符是大写时，后面的所有字符必须一致(都是大写，或者都是小写)
   * 第一个字符不是大写时，整个字符串必须一致(都是小写)
   * @param word
   * @return
   */
  public boolean detectCapitalUse(String word) {
    char[] chars = word.toCharArray();
    boolean flag = false;
    if (chars.length<=1)
      flag=true;
    //如果第一个字母是大写,就判断剩下的是不是全部是大写或者全部是小写
    if (chars[0] >= 'A' && chars[0]  <= 'Z'){
      //判断剩下的是不是全部是大写或者全部是小写
      String substring = word.substring(1);
      boolean equals1 = substring.toUpperCase().equals(substring);
      boolean equals2 = substring.toLowerCase().equals(substring);
      if (equals1 || equals2){
        flag =true;
      }
    }else {//如果第一个字母不是大写，就判断剩下的是不是全部是小写
      for (int j = 1; j < chars.length; j++) {
        if (chars[0] >= 'a' && chars[0]  <= 'z'){
          flag = true;
          continue;
        }else {
          flag = false;
          break;
        }
      }
    }
    return flag;
  }

  /**
   * 1189.“气球” 的最大数量
   * balloon
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
      if (text.charAt(i) == 'b'){
        countB++;
      }
      if (text.charAt(i) == 'a'){
        countA++;
      }
      if (text.charAt(i) == 'l'){
        countL++;
      }
      if (text.charAt(i) == 'o'){
        countO++;
      }
      if (text.charAt(i) == 'n'){
        countN++;
      }
    }
    countL = countL/2;
    countO = countO/2;
    int[] array = {countA, countB, countL, countN, countO};
    Arrays.sort(array);
    return array[0];
  }

  /**
   * 125. 验证回文串
   * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
   * 说明：本题中，我们将空字符串定义为有效的回文串。
   * @param s
   * @return
   */
  public boolean isPalindrome(String s) {
    if (s.length() <= 0){
      return true;
    }
    //首先将字母全部过滤出来，然后全部转换为大写或者小写，然后再比较首尾
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
      || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
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
    while (beginIndex < endIndex){
      if (str.charAt(beginIndex) != str.charAt(endIndex)){
        return false;
      }
      beginIndex++;
      endIndex--;
    }
    return true;
  }

  /**
   * 26. 删除排序数组中的重复项
   * @param nums
   * @return
   */
  public int removeDuplicates(int[] nums) {
    for (int i = 0; i < nums.length; i++) {

    }
    return 0;
  }

  /**
   * 统计字符串中的单词数（有问题）
   * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
   * @param s
   * @return
   */
  public static int countSegments(String s) {
    int count = 0;
    boolean isBlank = true;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' '){
        isBlank = true;
      }else {
        //如果当前字符不是空格
        if (isBlank){
          count ++ ;
        }
        isBlank = false;
      }
    }
    return count;
  }

  /**
   * 387. 字符串中的第一个唯一字符
   * @param s
   * @return
   */
  public int firstUniqChar(String s) {
//    int only[] = new int[26];
//    for(int i = 0; i < s.length(); i++){
//      only[s.charAt(i) - 'a']++;
//    }
//    for(int i = 0; i < s.length(); i++){
//      if(only[s.charAt(i) - 'a'] == 1)
//        return i;
//    }
//    return -1;
    //第二种方式
    HashMap<Character, Integer> hashMap = new HashMap<>(26);
    for (int i = 0; i < s.length(); i++) {
      hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
      if (hashMap.get(s.charAt(i)) == 1){
        return i;
      }
    }
    return -1;
  }

  /**
   * 459. 重复的子字符串
   * @param str
   * @return
   */
  public boolean repeatedSubstringPattern(String str) {
    return true;
  }

  /**
   * 1185. 一周中的第几天
   * @param day
   * @param month
   * @param year
   * @return
   */
  public String dayOfTheWeek(int day, int month, int year) {
    return null;
  }

  /**
   * 859. 亲密字符串
   * @param A
   * @param B
   * @return
   */
  public boolean buddyStrings(String A, String B) {
    return true;
  }

  /**
   * 485. 最大连续1的个数
   * 给定一个二进制数组， 计算其中最大连续1的个数。
   * [1,1,0,1,1,1]
   * @param nums
   * @return
   */
  public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1){
        count++;
        if (count >= maxCount){
          maxCount = count;
        }
      }else {
        count = 0;
      }
    }
    return maxCount;
  }

  /**
   * 824. 山羊拉丁文
   * @param str
   * @return
   */
  public String toGoatLatin(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a'){

      }
    }

    return null;
  }

  /**
   * 414. 第三大的数
   * 注意，要求返回第三大的数，是指第三大且唯一出现的数。
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
   * 面试题53 - I. 在排序数组中查找数字
   * @param nums
   * @param target
   * @return
   */
  public int search(int[] nums, int target) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target){
        count++;
      }
    }
    return count;
  }

  /**
   * 704. 二分查找
   * @param nums
   * @param target
   * @return
   */
  public int BinarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right){
      int middle = (left + right)/2;
      if (nums[middle] == target){
        return middle;
      }
      else if (target > nums[middle]){
        left = middle + 1;
      }else if (target < nums[middle]){
        right = middle - 1;
      }
    }
    return -1;
  }

  /**
   * 面试题 10.05. 稀疏数组搜索（二分查找）
   * @param words
   * @param s
   * @return
   */
  public int findString(String[] words, String s) {

    return -1;
  }

  /**
   * 面试题05. 替换空格
   * @param s
   * @return
   */
  public String replaceSpace(String s) {
    return null;
  }

  /**
   * 1281. 整数的各位积和之差
   * @param n
   * @return 286
   */
  public int subtractProductAndSum(int n) {
    int add = 0,mul = 1;
    while (n > 0){
      int yushu = n % 10;
      add += yushu;
      mul *= yushu;
      n = n / 10;
    }
    return mul - add;
  }

  /**
   * 258. 各位相加
   * @param num
   * @return
   */
  public int addDigits(int num) {
    int total = 0;
    while (num > 0){
      int yushu = num % 10;
      total += yushu;
      num = num / 10;
    }
    if (total >= 10){
      total = addDigits(total);
    }
    return total;
  }

  /**
   * 面试题03. 数组中重复的数字
   * @param nums
   * @return
   */
  public int findRepeatNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)){
        return num;
      }
      set.add(num);
    }
    return -1;
  }

  /**
   * 136. 只出现一次的数字
   * @param nums
   * @return
   */
  public int singleNumber(int[] nums) {
//    HashSet<Integer> set = new HashSet<>();
//    for (int num : nums) {
//      if (set.contains(num)){
//        return num;
//      }
//      set.add(num);
//    }
    return 0;
  }

  /**
   * 349. 两个数组的交集
   * 在 Java 提供了 retainAll() 函数.可以用
   * @param nums1
   * @param nums2
   * @return
   */
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    HashSet<Integer> set3 = new HashSet<>();
    for (int num : nums1) {
      set1.add(num);
    }
    for (int num : nums2) {
      set2.add(num);
    }

    for (int num : set1) {
      if (set2.contains(num)){
        set3.add(num);
      }
    }

    int[] data = new int[set3.size()];
    Iterator<Integer> iterator = set3.iterator();
    int i = 0;
    while (iterator.hasNext()){
      data[i] = iterator.next();
      i++;
    }
    return data;
  }

  /**
   * 面试题58 - II. 左旋转字符串
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
    int end = leftStr.length() -1;
    while (begin < end){
      char temp = chars[begin];
      chars[begin] = chars[end];
      chars[end] = temp;
      begin ++;
      end --;
    }
    String s1 = new String(chars);
    return rightStr + s1;
  }

  /**
   * 面试题 01.02. 判定是否互为字符重排
   * @param s1
   * @param s2
   * @return
   */
  public boolean CheckPermutation(String s1, String s2) {
    return true;
  }

  /**
   * 面试题 01.06. 字符串压缩
   * "aabcccccaaa"
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
      if (S.charAt(i) == ch){
        count++;
      }else {
        stringBuilder.append(ch).append(count);
        count = 1;
        ch =S.charAt(i);
      }
    }
    stringBuilder.append(ch).append(count);
    return stringBuilder.length()<S.length()?stringBuilder.toString():S;
  }

  /**
   * 面试题58 - I. 翻转单词顺序
   * @param s
   * @return
   */
  public String reverseWords(String s) {
    return null;
  }

  /**
   * 557. 反转字符串中的单词 III
   * @param s
   * @return
   */
  public String reverseWordsIII(String s) {
    return null;
  }

  /**
   * 面试题58 - I. 翻转单词顺序
   * @param s
   * @return
   */
  public String reverseWordsI(String s) {
    String[] s1 = s.trim().split(" ");
    StringBuilder newStr = new StringBuilder();
    int begin = 0;
    int end = s1.length - 1;
    while (begin < end){
      String temp = s1[begin];
      s1[begin] = s1[end];
      s1[end] = temp;
      begin++;
      end--;
    }
    for (int i=0; i<s1.length; i++) {
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
   * 104. 二叉树的最大深度
   * @param root
   * @return
   */
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
  }

  /**
   * 700. 二叉搜索树中的搜索
   * @param root
   * @param val
   * @return
   */
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null || root.val == val) return root;
    return val > root.val ? searchBST(root.right, val) : searchBST(root.left, val);
  }

  /**
   * 面试题 01.03. URL化
   * @param S
   * @param length
   * @return
   */
  public String replaceSpaces(String S, int length) {
    StringBuilder newStr = new StringBuilder();
    for (int i = 0; i < length; i++) {
      if (S.charAt(i) == ' '){
        newStr.append("%20");
      }else {
        newStr.append(S.charAt(i));
      }
    }
    return newStr.toString();
  }

  /**
   * 976. 三角形的最大周长
   * @param A
   * @return
   */
  public int largestPerimeter(int[] A) {
    return 1;
  }

  /**
   * 242. 有效的字母异位词
   * 字母异位词指：字母异位词是指由相同的字母按照不同的顺序组成的单词，
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

  private char[] charSort(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length ; i++) {
      for (int j = 0; j <chars.length -i -1; j++) {
        if (chars[j] > chars[j+1]){
          char temp = chars[j];
          chars[j] = chars[j+1];
          chars[j+1] = temp;
        }
      }
    }
    return chars;
  }
}
