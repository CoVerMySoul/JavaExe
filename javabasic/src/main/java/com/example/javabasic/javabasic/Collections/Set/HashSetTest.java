package com.example.javabasic.javabasic.Collections.Set;

import com.example.javabasic.javabasic.Pojo.Person;
import com.example.javabasic.javabasic.Pojo.Student;
import com.example.javabasic.javabasic.Pojo.User;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Description: HashSet的相关练习
 * HashSet是无序的,不重复（无序是指添加进去的顺序和取出来的顺序是不一致的）
 * @Author: TanBoQiuYun
 * @Date: 2019/12/26 14:34
 */
public class HashSetTest {
  public static void main(String[] args) {
//    test1();
//    test2();
    test3();
//    test4();
//    test5();

  }

  /**
   * 判断是否重复
   */
  private static void test5() {
    User user1 = new User("aa", 1, 1);
    User user2 = new User("bb", 12, 1);
    User user3 = new User("bb", 15, 1);
    Set<User> users = new HashSet<>();
    users.add(user1);
    users.add(user2);
    users.add(user3);

    Set<String> strings = new HashSet<>();
    users.forEach(item -> {
//      if (strings.contains(item.getUsername())){
//        System.out.println("有重复的值");
//      }
      if (strings.add(item.getUsername())) {
        System.out.println("有重复的值");
      }
      strings.add(item.getUsername());
    });
  }

  /**
   * 判断集合元素是否重复
   */
  private static void test4() {
    Set<String> stringSet1 = new HashSet<>();
    stringSet1.add("aa");
    stringSet1.add("bb");
    stringSet1.add("bb");


    Set<String> stringSet2 = new HashSet<>();
    stringSet1.forEach(item -> {
      if (stringSet2.contains(item)) {
        System.out.println("有重复的值");
      }
      stringSet2.add(item);
    });
    System.out.println(stringSet2);
  }

  /**
   * 重写了equals和hashCode方法
   * 无重复的原则：
   */
  private static void test3() {
    HashSet<String> strings = new HashSet<>();
    strings.add(new String("谭博"));
    strings.add(new String("谭博"));
    strings.add(new String("谭博"));
    strings.add(new String("谭博"));
    System.out.println("StringSet的长度：" + strings.size());//1
    Person person1 = new Person("谭博");
    Person person2 = new Person("谭博");
    System.out.println("重写equal后的比较对象：" + person1.equals(person2));

    HashSet<Person> set = new HashSet<>();
    set.add(new Person("谭博"));
    set.add(new Person("谭博"));
    set.add(new Person("谭博"));
    set.add(new Person("谭博"));
    set.add(new Person("谭博"));
    System.out.println("Person对象Set的长度：" + set.size());//5
  }

  private static void test2() {
    HashSet<Student> hashSet1 = new HashSet<>();
    //通过迭代器遍历,需要先获取一个迭代器对象，通过set获取
    for (Student one : hashSet1
    ) {
      String name = one.getName();
      System.out.println(name);
    }
  }

  /**
   * HashSet的小练习——迭代器遍历Set集合
   */
  private static void test1() {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("1");
    hashSet.add("2");
    hashSet.add("3");
    hashSet.add("4");
    hashSet.add("A");
    hashSet.add("B");
    //迭代器遍历Set集合
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
