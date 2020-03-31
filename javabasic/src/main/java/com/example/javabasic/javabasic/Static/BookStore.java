package com.example.javabasic.javabasic.Static;

/**
 * 这是一个书店
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/3/27 14:59
 */
public class BookStore {

  /**
   * @param price
   * @param identyf
   */
  public void buyBook(float price, int identyf) {
    switch (identyf) {
      case 0:
        System.out.println("书店管理员,折扣是5折，价格是：" + price * 0.5);
        break;
      case 1:
        System.out.println("VIP,折扣是8折，价格是：" + price * 0.8);
        break;
      case 2:
        System.out.println("普通用户,没有折扣，价格是：" + price);
        break;
      default:
        System.out.println("不能买书");
    }
  }


}
