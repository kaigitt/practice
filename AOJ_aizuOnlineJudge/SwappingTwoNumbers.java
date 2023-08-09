import java.util.*;

public class SwappingTwoNumbers {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 0;
    while(sc.hasNextInt()){
      a = sc.nextInt();
      b = sc.nextInt();
      if(a == 0 && b == 0){
        break;
      }

      if(a > b){
        int tmp = 0;
        tmp = a;
        a = b;
        b = tmp;
      }
      System.out.println(a + " " + b);
    }
  }
}
