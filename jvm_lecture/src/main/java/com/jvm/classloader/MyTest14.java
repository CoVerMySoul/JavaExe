package com.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 *
 * @Author: TanBoQiuYun
 * @Date: 2020/4/5 12:05
 */
public class MyTest14 {
  public static void main(String[] args) throws IOException {
    ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
    System.out.println(contextClassLoader);

    String resourceName = "JVM/MyTest13.class";
    URL  urls = contextClassLoader.getResource(resourceName);
    System.out.println(urls);
  }
}
