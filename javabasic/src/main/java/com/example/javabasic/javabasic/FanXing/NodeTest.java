package com.example.javabasic.javabasic.FanXing;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2019/12/9 15:48
 */
public class NodeTest {
  public static void main(String[] args) {
//    nodaTest1();
    nodeTest2();

  }

  private static void nodeTest2() {
    Node<Number> node1 = new Node<>(10);
    Node<Long> node2 = new Node<>(20L);
//    getMyData2(node1);
//    getMyData2(node2);
    getUpperData(node2);
  }

  /**
   * 泛型上限 这里只能是Number类及其子类
   */
  private static void getUpperData(Node<? extends Number> node) {
    System.out.println(node.getData());
  }

  public static void getMyData(Node<Number> node){
    System.out.println(node.getData());
  }

  /**
   * 可以接受任意的泛型类型
   * @param node
   */
  public static void getMyData2(Node<?> node){
    //不能修改
//    node.setData(10);
    //可以读取
    System.out.println(node.getData());
  }
  private static void nodaTest1() {
    Node<Integer> integerNode = new Node<>();
    Node<String> stringNode = new Node<>("tanbo");
    System.out.println(stringNode.getData());
  }

  /**
   * 泛型方法 返回的是<T> T[]
   * @param array
   * @param i
   * @param t
   * @param <T>
   * @return
   */
  public static <T> T[] func(T[] array, int i, int t){
    T temp = array[i];
    array[i] = array[t];
    return array;
  }
}
