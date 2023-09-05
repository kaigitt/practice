import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        long differ = 0;
        long preNum = 0;
        arr[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
          arr[i] = sc.nextInt();
          differ += Math.abs(arr[i] - arr[i-1]);
        }
        
        for (int i : arr) {
          System.out.println(i);
        }
        System.out.println(differ / N);

    }
}
