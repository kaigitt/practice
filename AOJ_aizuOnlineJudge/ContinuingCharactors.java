import java.util.*;

public class ContinuingCharactors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        while(sc.hasNextLine()){
          str = sc.nextLine();
          str = str.trim();
          char[] c = str.toCharArray();
          for (int i = 0; i < c.length; i++) {
            
            System.out.print(i); 
              System.out.println(c[i]); 
            
          }



        }
        
    }
}
