package com.example.java8.java8.Stream;

import com.example.java8.java8.Pojo.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description: Stream分组与分区
 * 其实本质和SQL是一样的
 * @Author: TanBoQiuYun
 * @Date: 2019/12/24 14:45
 */
public class StreamTest4 {
  public static void main(String[] args) {
    List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
    List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");
//    test1(list1, list2);

    User user1 = new User("zhangsan", 100, 20);
    User user2 = new User("lis", 90, 20);
    User user3 = new User("wangwu", 90, 30);
    User user4 = new User("zhangsan", 80, 40);
    List<User> users = Arrays.asList(user1, user2, user3, user4);
//    test2(users);
//    test3(users);
    test4(users);
  }

  /**
   * 分区——90及90以上就是通过(true),否则为不通过(false)
   * @param users
   */
  private static void test4(List<User> users) {
    Map<Boolean, List<User>> collect = users.stream()
            .collect(Collectors.partitioningBy(user -> user.getScore() >= 90));
    System.out.println(collect);
  }

  /**
   * 分组——select name, count(*) from user group by name
   * @param users
   */
  private static void test3(List<User> users) {
    Map<String, Long> collect = users.stream()
            .collect(Collectors.groupingBy(User::getUsername, Collectors.counting()));
//    System.out.println(collect);

    //取平均分数
    Map<String, Double> collect1 = users.stream()
            .collect(Collectors.groupingBy(User::getUsername, Collectors.averagingInt(User::getScore)));
    System.out.println(collect1);
  }

  /**
   * 分组——按照姓名进行分组
   * @param users
   */
  private static void test2(List<User> users) {

    Map<String, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getUsername));
    System.out.println(collect);
  }

  /**
   * 完成交叉输出,flatMap是把结果打平了，返回单个的stream对象
   * @param list1
   * @param list2
   */
  private static void test1(List<String> list1, List<String> list2) {
    List<String> collect = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2))
            .collect(Collectors.toList());
    collect.forEach(item -> System.out.println(item));
  }
}
