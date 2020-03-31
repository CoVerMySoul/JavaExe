package com.example.javabasic.javabasic.Utils;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/1/9 16:18
 */
public class ArrayBox extends AbstractBox {

  //设计一个自己的属性，用来存放真实数据的
  private int[] elementData;
  //设计一个自己的属性，用来记录数组内存储的有效元素的个数
  private int size = 0;

  //将用户给定的element存起来,返回值表示是否添加成功
  public boolean add(int element) {
    return true;
  }

  //用来获取给定位置的元素，参数是索引位置，返回值是取得的元素
  public int get(int index) {
    //判断下标是否合法
    return 1;
  }

  //用来删除给定位置的元素，参数是索引位置，返回值是删除掉的那个元素
  public int remove(int index) {
    //判断下标是否合法
    return 1;
  }

  //用来获取长度
  public int size() {
    return 0;
  }
}
