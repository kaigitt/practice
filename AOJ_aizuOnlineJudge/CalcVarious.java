import java.util.*;

public class CalcVarious {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxNum = Integer.MIN_VALUE;
    int minNum = Integer.MAX_VALUE;
    long total = 0;

    int tmp = 0;
    for (int i = 0; i < n; i++) {
      tmp = sc.nextInt();
      maxNum = Math.max(maxNum, tmp);
      minNum = Math.min(minNum, tmp);
      total += tmp;
    }

    System.out.printf("%d %d %d%n",minNum, maxNum, total);
    
  }
}
