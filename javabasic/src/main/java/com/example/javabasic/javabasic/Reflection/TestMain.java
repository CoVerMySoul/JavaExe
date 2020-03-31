package com.example.javabasic.javabasic.Reflection;

import com.example.javabasic.javabasic.Pojo.Reflection;
import com.example.javabasic.javabasic.Pojo.Student;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/27 16:24
 */
public class TestMain {

  public static void main(String[] args) {
//    test1();
    test2();
  }

  /**
   * Class类中的常用方法
   */
  private static void test2() {
    Class classzz = Reflection.class;
    /*
    获取类的修饰符（包含权限和特征）
    如果类中有权限和特征，则返回值就是求和
    每一个修饰符用一个整数表示
    从0开始——0 1 2 4 8 16 32 64 128 256
    1-public  2-private  4-protected
     */
    int modifiers = classzz.getModifiers();
    System.out.println("类的修饰符：" + modifiers);
  }

  /**
   * 获取Class的三种方式
   */
  private static void test1() {
    Class<Student> studentClass1 = Student.class;
    Student student = new Student("1", 20);
    Class<? extends Student> studentClass2 = student.getClass();
    System.out.println("第一种方式" + studentClass1);
    System.out.println("第二种方式" + studentClass2);

    try {
      Class<?> studentClass3 = Class.forName("com.example.javabasic.javabasic.Pojo.Student");
      System.out.println("第三种方式" + studentClass3);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
