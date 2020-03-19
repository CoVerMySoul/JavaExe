package com.example.java8.java8.FunctionalInterface;

import com.example.java8.java8.Pojo.Person;

import java.util.function.Supplier;

/**
 * @Description: Supplier不接受参数，返回一个结果
 * @Author: TanBoQiuYun
 * @Date: 2019/12/20 13:58
 */
public class SupplierTest {
  public static void main(String[] args) {
    personTest();
  }

  /**
   * 第一个练习
   */
  private static void personTest() {
    //    Supplier<String> stringSupplier = () -> "TB";
//    System.out.println(stringSupplier.get());
    Supplier<Person> personSupplier = new Supplier<Person>() {
      @Override
      public Person get() {
        return null;
      }
    };

    Supplier<Person> supplier = () -> new Person();
    System.out.println(supplier.get().getAge());

    Supplier<Person> supplier1 = Person::new;

  }
}
