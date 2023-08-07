import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] canReadNum = {0,1,6,8,9};

        for (int i = n; i < m + 1; i++) {
          System.out.println(i);
          String flag = "true";
          
          int numLen = String.valueOf(i).length();
          String[] istr = new String[numLen];

          if(flag){
            break;
          }

        }
        

        System.out.println(flag);
    }
}