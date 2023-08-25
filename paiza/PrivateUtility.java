import java.util.*;
public class PrivateUtility {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findSumOfDigits(n));
        
    }

    //10進法表記の各桁の合計を求める
    public static int findSumOfDigits(int n){
      int sum = 0;
      while(n > 0){
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }
}