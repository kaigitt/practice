import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String flag = "DENIED";
      	for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0){
                if( num % 3 == 0 || num % 5 == 0){
                  flag = "APPROVED";
                } else {
                  flag = "DENIED";
                }
            }
        }
      System.out.println(flag);
    }
}