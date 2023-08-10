import java.util.*;

public class SumNumers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(sc.hasNextLine()){
          str = sc.nextLine();
          if(str.equals("0")){
            break;
          }
          int sum = 0;
          char[] c = str.toCharArray();
          for (int i = 0; i < c.length; i++) {
            sum += Character.getNumericValue(c[i]);
          }
          System.out.println(sum);
        }
        
    }
}
