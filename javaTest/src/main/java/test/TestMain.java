package test;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/26 15:38
 */
public class TestMain {
  public static void main(String[] args) {

    char grade;
    int points = 0;
    for (grade = 'A'; grade < 'F'; grade++) {
      switch (grade) {
        case 'A':
          points = 4;
          break;
        case 'B':
          points = 3;
        case 'C':
          points = 2;
        case 'D':
          points = 1;
          break;
        case 'E':
        case 'W':
          points = 0;
      }
      if (points > 0) {
        System.out.println("passed,points =" + points);
      } else {
        System.out.println("failed");
      }
    }
  }
}
