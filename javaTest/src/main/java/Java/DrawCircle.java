package Java;

/**
 * @Description:
 * @Author: TanBoQiuYun
 * @Date: 2020/4/6 14:29
 */
public interface DrawCircle {
  public static final int tanbo = 1;
  public  abstract  void drawCircle(int radis, int x, int y);
}

class RedCircle implements DrawCircle{

  @Override
  public void drawCircle(int radis, int x, int y) {
    System.out.println("红色圆");
  }
}
class GreenCircle implements DrawCircle{

  @Override
  public void drawCircle(int radis, int x, int y) {
    System.out.println("GreenCircle");
  }
}