package JVM;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/2 13:58
 */
public class MyTest5 {
  public static void main(String[] args) {
    System.out.println(MyChild5.b);
  }
}

interface MyParent5{

  public static int a = 5;
}

interface MyChild5 extends MyParent5{
  public static int b = 6;
}
