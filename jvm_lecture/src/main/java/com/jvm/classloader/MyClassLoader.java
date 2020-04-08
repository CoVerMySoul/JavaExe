package com.jvm.classloader;

/**
 * 自定义类加载器（有待完善）
 * ClassLoader类虽然是抽象类，但是没有抽象方法
 * @Author: TanBoQiuYun
 * @Date: 2020/4/5 10:02
 */
public class MyClassLoader extends ClassLoader{

  private String classLoaderName;
  private String fileExtension = ".class";

  public MyClassLoader(String classLoaderName){
    super();//将系统类加载器作为该类的父类加载器
    this.classLoaderName = classLoaderName;
  }

  public MyClassLoader(ClassLoader parent, String classLoaderName){
    super(parent);//显示指定将传递过来的parent作为父类加载器
    this.classLoaderName = classLoaderName;
  }

}
