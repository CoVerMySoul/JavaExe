package com.example.javabasic.javabasic.FanXing;


/**
 * @Description: 自定义泛型接口
 * T:表示参数化类型，只有实际使用的时候才会指定具体的类型
 * @Author: TanBoQiuYun
 * @Date: 2019/12/9 15:46
 */
public interface Test<A> {
  void hello(A a);
}

//class Son<A> implements packa<A>{
//
//}

