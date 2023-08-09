import java.util.*;

public class Circle {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();

    // 円の面積の計算
    double area = Math.PI * r * r;
    // 円周の計算
    double circumference = 2 * Math.PI * r;

    // 結果の出力
    System.out.printf("%.6f %.6f%n", area, circumference);
  }
}
