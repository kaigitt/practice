import java.util.*;

public class PrintCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNextInt()){
          int n = sc.nextInt();
          if(n == 0){ break; } //0の時は出力しない
          System.out.println("Case " + i + ": " + n);
          i++;
        }
        sc.close();
    }
}