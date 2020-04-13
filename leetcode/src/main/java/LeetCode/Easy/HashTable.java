package LeetCode.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description: 关于哈希表的题
 * @Author: TanBoQiuYun
 * @Date: 2020/4/2 17:18
 */
public class HashTable {

  /**
   * 349. 两个数组的交集
   * 在 Java 提供了 retainAll() 函数.可以用
   *
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
      if (set2.contains(num)) {
        set3.add(num);
      }
    }

    int[] data = new int[set3.size()];
    Iterator<Integer> iterator = set3.iterator();
    int i = 0;
    while (iterator.hasNext()) {
      data[i] = iterator.next();
      i++;
    }
    return data;
  }

  /**
   * 136. 只出现一次的数字
   *  可以用异或运算
   * @param nums
   * @return
   */
  public int singleNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)){
        set.remove(num);
      }else {
        set.add(num);
      }
    }
    return set.iterator().next();
  }

  /**
   * 387. 字符串中的第一个唯一字符
   *
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
      if (hashMap.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }

  /**
   * 给定一个整数数组，判断是否存在重复元素。
   *
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
    for (int num : nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }
    return false;
  }

  public int[] smallerNumbersThanCurrent(int[] nums) {
    return new int[0];
  }

  public boolean uniqueOccurrences(int[] arr) {
    return false;
  }

  /**
   * 主方法——测试
   * @param args
   */
  public static void main(String[] args) {
    HashTable hashTable = new HashTable();
    System.out.println(hashTable.smallerNumbersThanCurrent(new  int[]{}));
  }
}
