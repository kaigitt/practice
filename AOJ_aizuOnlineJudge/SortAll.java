import java.util.*;

public class SortAll {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }


    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if(arr[i] > arr[j]){
          int tmp = 0;
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if(i < n-1){
        System.out.printf(arr[i] + " ");
      } else {
        System.out.println(arr[i]);
      }
    }
  }
}
