package com.example.javabasic.javabasic.Utils;

/**
 * 设计模式-适配器模式之缺省适配器
 * @Author: TanBoQiuYun
 * @Date: 2020/1/16 10:33
 */
public abstract class AbstractBox implements Box{
  public abstract boolean add(int element);

  public abstract int get(int index);

  public abstract int remove(int index);

  public abstract int size();

  //子类可能需要可能不需要
  public void add(int index, int element){
    //可以抛出自定义异常
  }
  //子类可能需要可能不需要
  public void addAll(){
    //可以抛出自定义异常
  }

  //判断下标是否合法，子类里面有很多需要得
  public void indexRangeCheck(int index){
      int size = 10;
      if (index < 0 || index >= size){
        //抛出自定义得异常
      }
  }
}
