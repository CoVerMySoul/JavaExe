package com.example.javabasic.javabasic.Test;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/2 16:43
 */
public class Father {
  public String name;
  public Father(){

  }
  public Father(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
class Son extends Father{
  private String sonName;
  public Son(String sonName){
    super(sonName);
    String name = super.getName();
  }
}
