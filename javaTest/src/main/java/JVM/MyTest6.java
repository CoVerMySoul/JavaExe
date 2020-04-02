package JVM;

/**
 * @Description: 这个例子可以帮助JVM类加载器的执行顺序，
 * 对我们理解类的主动使用和对类的初始化很有帮助
 * @Author: TanBoQiuYun
 * @Date: 2020/4/2 14:31
 */
public class MyTest6 {
  public static void main(String[] args) {
    SingleTon instance = SingleTon.getInstance();
    System.out.println("counter1：" + SingleTon.counter1);
    System.out.println("counter2：" + SingleTon.counter2);
  }
}

class SingleTon{
  public static int counter1;

  private static SingleTon singleTon = new SingleTon();

  private SingleTon(){
    counter1++;
    counter2++;
  }

  public static int counter2 = 0;

  public static SingleTon getInstance(){
    return singleTon;
  }
}
