package packa;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/26 15:32
 */
public class TestA {

  public void testPublic() {
    System.out.println("我是Public修饰");
  }

  void testDefault() {
    System.out.println("我是默认修饰");
  }

  protected void testProtected() {
    System.out.println("我是protected修饰");
  }

  private void testPrivate() {
    System.out.println("我是private修饰");
  }

  public static void main(String[] args) {
    TestA a = new TestA();
    a.testDefault();
    a.testPrivate();
    a.testProtected();
    a.testPublic();
  }

}
