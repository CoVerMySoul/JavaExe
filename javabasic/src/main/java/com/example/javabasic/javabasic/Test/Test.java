package com.example.javabasic.javabasic.Test;

import com.example.javabasic.javabasic.Pojo.People;
import com.example.javabasic.javabasic.Pojo.Person;
import com.example.javabasic.javabasic.Pojo.Tanbo;
import com.example.javabasic.javabasic.Pojo.Teacher;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/12/25 15:39
 */
public class Test {
  public static void main(String[] args) {

//    test1();
//    test2();
//    test3();
//    test4();
    Scanner scanner = new Scanner(System.in);
    do {
      int x = scanner.nextInt();
      if (x <= 0) {
        break;
      }
      test5();
    } while (true);
  }

  private static void test5() {
    //创建对象
//    Teacher teacher = new Teacher();
//    teacher.eat();
//    teacher.teach();
//    teacher.sleep();
//    teacher.talk();
    //创建people
    People people = new People();
    //多态 现在老师是作为一个人的形态，是没有教书这个功能的
    People p = new Teacher();//自动向上转型
    p.eat();
    p.sleep();
    p.talk();

    Teacher t = (Teacher) p;//向下转型，需要强制类型转换
    t.teach();
  }

  private static void test4() {
    int i = new Random().nextInt(100) % 10;
    System.out.println(i);
//    String folderName = new SimpleDateFormat("yyyyMMdd").format(new Date());
  }

  private static void test3() {
    byte[] bytes = new byte[0];
    System.out.println(bytes);
    Tanbo tanbo = new Tanbo();
  }

  /**
   * 将字符串的每个字符转成
   */
  private static void test2() {

  }

  private static void test1() {
    char c1 = 'x';
    char c2 = 'a';
    int i = c1 - c2;
    System.out.println(c2);
  }
}
