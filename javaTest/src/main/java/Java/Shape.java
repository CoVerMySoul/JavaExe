package Java;

/**
 * 形状
 * @Author: TanBoQiuYun
 * @Date: 2020/4/6 14:32
 */
public abstract class Shape {
  protected DrawCircle drawCircle;

  public Shape(DrawCircle drawCircle) {
    this.drawCircle = drawCircle;
  }

  public abstract void draw();
}
