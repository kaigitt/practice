import java.util.*;
public class MiniSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b){
          int tmp = 0;
          tmp = a;
          a = b;
          b = tmp;
        } else if( b > c) {
          int tmp = 0;
          tmp = b;
          b = c;
          c = tmp;
        }

        System.out.println(a + " " + b + " " + c);
    }
    
}