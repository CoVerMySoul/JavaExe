package Java;

/**
 * 圆形
 * @Author: TanBoQiuYun
 * @Date: 2020/4/6 14:35
 */
public class Circle extends Shape{
  private int x, y, radius;

  public Circle(int x, int y, int radius, DrawCircle drawCircle) {
    super(drawCircle);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  public void draw() {
    drawCircle.drawCircle(x, y, radius);
  }
}
