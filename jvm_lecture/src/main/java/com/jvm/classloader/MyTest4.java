package com.jvm.classloader;


/**
 * 对于数组实例来说，其类型是由JVM在运行期动态生成的，表示为[LJVM.MyParent4;
 * 动态生成的类型，其父类型就是object
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/1 16:16
 */
public class MyTest4 {
  public static void main(String[] args) {
//    MyParent4 myParent4 = new MyParent4();
    MyParent4[] array = new MyParent4[1];
    System.out.println(array.getClass());

    MyParent4[][] myParent4s = new MyParent4[1][1];
    System.out.println(myParent4s);

    System.out.println("***********************************************");
    int[] intarray = new int[10];
    System.out.println(intarray.getClass());
    System.out.println("父类型："+intarray.getClass().getSuperclass());

    int[][] twoArray = new int[1][3];
    System.out.println(twoArray.getClass());
    System.out.println("父类型："+twoArray.getClass().getSuperclass());

    System.out.println("************************************************");
    float[] floats = new float[2];
    System.out.println(floats.getClass());
  }
}

class MyParent4{
  static {
    System.out.println("MyParent4 static block");
  }
}
