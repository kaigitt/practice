import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a = sc.nextInt();
        int y = sc.nextInt();
        int b = sc.nextInt();
        int z = sc.nextInt();
        int c = sc.nextInt();
        
        int[] dp = new int[n+z];
        
        Arrays.fill(dp, 100000);
        dp[0] = 0;
        for (int i = 1; i < n+z; i++){
            if(i >= x){
                dp[i] = Math.min(dp[i], dp[i-x] + a);
            }
            if(i >= y){
                dp[i] = Math.min(dp[i], dp[i-y] + b);
            }
            if(i >= z){
                dp[i] = Math.min(dp[i], dp[i-z] + c);
            }
            //System.out.println(dp[i]);
        } 
        
        for (int i = n + z - 2;i >= 1 ; i--){
            //System.out.println(i);
            dp[i] = Math.min(dp[i], dp[i+1]);
        }
        
        System.out.println(dp[n]);
    }
}