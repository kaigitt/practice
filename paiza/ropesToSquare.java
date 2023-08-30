import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = (n / 4)*(n / 4);
        System.out.println(target);
        for (int i = 0; i < n/2; i++) {
          for (int j = 0; j < n/2; j++) {
            System.out.println(Math.pow(j+(n-j),2));
            if(target == Math.pow(i+(n-i),2) + Math.pow(j+(n-j),2)){
              System.out.println(i + " " + j);
            }
          }
        }
    }
}