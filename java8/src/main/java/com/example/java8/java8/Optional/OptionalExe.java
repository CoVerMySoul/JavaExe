package com.example.java8.java8.Optional;

import com.example.java8.java8.Pojo.Company;
import com.example.java8.java8.Pojo.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Description: Optional类的练习  建议是用函数式编程的思想去用
 * 构造方法是私有的，只能通过调用静态的工厂方法的形式来创建实例
 * 很多语言其实都早就出现了，比如Swift、Groovy、Scala
 * @Author: TanBoQiuYun
 * @Date: 2019/12/6 14:04
 */
public class OptionalExe {
  public static void main(String[] args) {
    Optional<String> hello = Optional.of("tanbo");
    //这种方式并不推荐
//    if (hello.isPresent()){
//      System.out.println("这是optional类打印的结果："+hello.get());
//    }

    //推荐的Optional方式 如果有值，就打印，如果没值，就什么都不做
    hello.ifPresent(item -> System.out.println(item));
    System.out.println("-----------------------------");

    System.out.println(hello.orElse("world"));

    System.out.println("-----------------------------");

    System.out.println(hello.orElseGet(() -> "111"));

    System.out.println("---------------  ofNullAble  ---------------");

    Optional<String> tanbo = Optional.ofNullable("tanbo");


    System.out.println("------------------- 集合练习 标准写法---------------------------");
    User user1 = new User();
    user1.setUsername("1");

    User user2 = new User();
    user2.setUsername("12");

    User user3 = new User();
    user3.setUsername("123");
    List<User> users = Arrays.asList(user1, user2, user3);

    Company company = new Company();
//    company.setUserList(users);

    Optional<Company> company1 = Optional.ofNullable(company);
    List<User> users1 = company1.map(theCompany -> theCompany.getUserList()).orElse(Collections.emptyList());
    System.out.println(users1);

  }
}
