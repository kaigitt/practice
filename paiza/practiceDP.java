import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N = 5;
    int[] a = {2, 5, 30, 6, 2};

    int result = maxSum(N, a);
    System.out.println(result);
    
  }

  public static int maxSum(int N, int[] a){
    int[] dp = new int[N + 1];
    for (int i = 0; i < N; i++) {
      dp[i + 1] = Math.max(dp[i], dp[i] + a[i]);
    }
    return dp[N];
  }
}
