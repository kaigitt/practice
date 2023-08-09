import java.util.*;

public class StructuredProgramming {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    CheckNum(n);
  }

  ArrayList<Integer> arr = new ArrayList<>();
  public static int CheckNum(int n){
    if(n % 3 != 1 && n > 0){
      arr.add(n);
      System.out.println(n);
      CheckNum(n - 3);
    }
    return 0;
  }
}
