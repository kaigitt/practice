import java.util.*;
public class PrivateUtility {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n / 2 + n % 2);
        System.out.println((n + 2 - 1)/ 2);
        //a人をb人ずつのグループに分けるとき,余った人は一つのグループとして何グループできるのか
        //x = (a + b - 1)/ b
        System.out.println((17 + 3 - 1)/ 3);
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

    //nが素数かどうかを判定する
    public static boolean isPrime(int n){
      //ループの条件がi*iとなっているのは nが素数じゃなければnの約数はsqrt(n)より小さい値に存在するから(i*iまでかくにんすればいい)
      for (int i = 2; i*i < n; i++) {
        if(n % i == 0){
          return false;
        }
      }
      return true;
    }

    //約数を列挙する
    public static ArrayList<Integer> findDivisors(int n){
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 1; i * i < n; i++) {
        if(n % i == 0){
          arr.add(i);
          //i*i以上の約数はここで判定する
          if(n/i != i){
            arr.add(n/i);
          }
        }
      }

      //昇順にソート
      Collections.sort(arr);
      return arr;
    }

}