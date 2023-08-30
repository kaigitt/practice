import java.util.*;
public class Main {
    public static void main(String[] args) {
        //ï˚êj
        // 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sc.nextInt());
        int[][] icecream = new int[n][2];
        for (int i = 0; i < n; i++) {
          icecream[i][0] = sc.nextInt();
          icecream[i][1] = sc.nextInt();
        }



        /* TLEÇµÇƒÇµÇ‹Ç§
        int maxFlavor = 0;
        for (int i = 0; i < n; i++) {
          int tmp = 0;
          for (int j = i + 1; j < n; j++) {
            if(icecream[i][0] == icecream[j][0]){
              if(icecream[i][1] > icecream[j][1]){
                tmp = icecream[i][1] + ((icecream[j][1])/2);
              } else {
                tmp = icecream[j][1] + ((icecream[i][1])/2);
              }
              
            } else {
              tmp = icecream[i][1] + (icecream[j][1]);
            }
            if(maxFlavor < tmp){
              maxFlavor = tmp;
            }
          }
        }
        System.out.println(maxFlavor);
         */
    }
}