import java.util.*;

public class HowManyWays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int x = 0;
        while(sc.hasNextInt()){
          n = sc.nextInt();
          x = sc.nextInt();
          if(n == 0 && x == 0) { break; }
          int count = 0;
          for (int i = 1; i < n+1; i++) {
            for (int j = i; j < n+1; j++) {
              for (int k = j; k < n+1; k++) {
                if(i != j && j != k && i != k && i + j + k == x){
                  count++;
                }
              }
            }
          }
          System.out.println(count);
        }
    }
}
