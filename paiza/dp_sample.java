import java.util.HashMap;
import java.util.Map;

public class FibnacciDP{

  //メモ用のMap
  private static Map<Integer, Integer> memo = new HashMap<>();

  public static main(String[] args){
    int n = 10;
    int result = fibDP(n);
    System.out.println(result);
  }

  public static int fibDP(int n){
    if(memo.contains(key)) {
      return memo.get(key);
    }

    int result;
    if (n == 0){
      result = 0;
    } else if(n == 1) {
      result = 1;
    } else {
      result = fibDP(n - 1) + fibDP(n);
    }

    memo.put(n, result);
    return result;
  }
}