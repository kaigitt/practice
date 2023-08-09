import java.util.*;

public class ReversingNumbers {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = n-1; 0 <= i; i--) {
      if(0 < i){
        System.out.print(arr[i] + " ");
      } else {
        System.out.println(arr[i]);
      }
    }
  }
}
