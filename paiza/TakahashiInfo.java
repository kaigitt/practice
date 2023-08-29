import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] divide = {"dream", "dreamer", "erase", "eraser"};

        String S = sc.next();

        StringBuilder sb = new StringBuilder(S).reverse();
        String reverseS = sb.toString();

        for (int i = 0; i < divide.length; i++) {
          divide[i] = new StringBuilder(divide[i]).reverse().toString();
        }

        boolean can = true;
        for (int i = 0; i < reverseS.length(); i++) {
          boolean can2 = false;
          for (int j = 0; j < divide.length; j++) {
            String d = divide[j];
            if(i + d.length() <= reverseS.length() && reverseS.substring(i, i + d.length()).equals(d)){
              can2 = true;
              i += d.length();
            }
          }

          if(!can){
            can = false;
            break;
          }
        }
      
        if(can){
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
    }
}