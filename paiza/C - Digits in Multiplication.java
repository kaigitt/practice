import java.util.ArrayList;

public class DigitsinMultiplication {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  }
  

  public static ArrayList<Integer> findDivisors(int n){
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 1; i * i < n; i++) {
      if(n % i == 0){
        arr.add(i);
      }
    }

    return arr;
  }
}
