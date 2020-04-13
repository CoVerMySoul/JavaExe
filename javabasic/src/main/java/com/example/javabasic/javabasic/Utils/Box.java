package com.example.javabasic.javabasic.Utils;

/**
 * 一个盒子定义了一套规则：只有有一样行为得就是一个盒子
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/1/9 16:31
 */
public interface Box{
//  public static final  String x = "1";

  public boolean add(int element);

  public int get(int index);

  public int remove(int index);

  public int size();

  public void add(int index, int element);

  public void addAll();
}
