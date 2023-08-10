import java.util.*;

public class TogglingCases {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        for(int i = 0; i < str.length; i++){
          char upCase = Character.toUpperCase(str[i]);
          char lowerCase = Character.toLowerCase(str[i]);
          if(lowerCase == str[i]){
            str[i] = upCase;
          } else if(upCase == str[i]) {
            str[i] = lowerCase;
          }
        }

        System.out.println(str);
    }
}
