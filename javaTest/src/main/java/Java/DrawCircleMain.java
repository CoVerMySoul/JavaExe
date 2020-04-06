package Java;

/**
 * 简单绘图工具，可以绘制不同形状不同颜色的图形
 * @Author: TanBoQiuYun
 * @Date: 2020/4/6 14:38
 */
public class DrawCircleMain {
  public static void main(String[] args) {
    Shape redCircle = new Circle(100,100, 10, new RedCircle());
    Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
    redCircle.draw();
    greenCircle.draw();
  }
}
