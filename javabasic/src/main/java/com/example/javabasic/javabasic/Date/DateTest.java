package com.example.javabasic.javabasic.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/12/31 16:54
 */
public class DateTest {
  public static void main(String[] args) {
    test1();
  }

  private static void test1() {
    String folderName = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    System.out.println(folderName);
  }
}
