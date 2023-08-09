import java.util.*;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    double result = (double) a / b;
    System.out.print(a / b + " ");
    System.out.print(a % b + " ");
    //printfでフォーマットを指定して出力する
    System.out.printf("%.8f%n", result);
  }
}
