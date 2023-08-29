import java.util.*;

public class DigitsinMultiplication {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();

    arr = findDivisors(n);
    int smallestDigits = Integer.MAX_VALUE;
    for (int i = 0; i < arr.size(); i++) {
      for (int j = i; j < arr.size(); j++) {
        if(arr.get(i) * arr.get(j) == n){
          int bigDigit = Math.max(Integer.toString(arr.get(i)).length(), Integer.toString(arr.get(j)).length());
          if(smallestDigits > bigDigit){
            smallestDigits = bigDigit;
          }   
        }
      }
    }

    System.out.println(smallestDigits);
  }
  

  public static ArrayList<Integer> findDivisors(int n){
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 1; i * i < n; i++) {
      if(n % i == 0){
        arr.add(i);
        if(n/i != i){
          arr.add(n/i);
        }
      }
    }

    Collections.sort(arr);

    return arr;
  }
}
