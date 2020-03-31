package com.example.javabasic.javabasic.FanXing;

/**
 * @Description: 自定义泛型类
 * T:表示参数化类型，只有实际使用的时候才会指定具体的类型
 * 泛型只作用于编译期检查，在编译后会被擦除，也就是说成功编译后的class文件中是不包含任何泛型信息的
 * @Author: TanBoQiuYun
 * @Date: 2019/12/9 15:46
 */
public class Node<T> {
  private T data;

  public Node() {
  }

  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
