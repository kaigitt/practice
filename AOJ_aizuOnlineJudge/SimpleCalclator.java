import java.util.*;

public class SimpleCalclator {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = 0;
    String op = "";
    int b = 0;

    while(sc.hasNextInt()){
      a = sc.nextInt();
      op = sc.next();
      b = sc.nextInt();

      int result = 0;
      switch(op){
        case "?":
        //システムを終了させる
        System.exit(0);
        break;

        case "+":
        result = a + b;
        break;

        case "-":
        result = a - b;
        break;

        case "*":
        result = a * b;
        break;

        case "/":
        result = a / b;
        break;
      }

      System.out.println(result);

    }
  }
}
