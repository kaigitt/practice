import java.util.*;
public class Main {
    public static void main(String[] args) {
        //ï˚êj
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder(sc.next());
        int q = sc.nextInt();
        int[][] command = new int[q][2];
        String[] target = new String[q];
        int UorL = -1;
        int UorLIndex = -1;
        for (int i = 0; i < q; i++) {
          command[i][0] = sc.nextInt();
          command[i][1] = sc.nextInt();
          target[i] = sc.next();
          UorL = command[i][0];
          UorLIndex = i;
        }

        for (int i = 0; i < q; i++) {
          if(command[i][0] == 1){
            char newChar = target[i].charAt(0);
            //s.replace(command[i][1], command[i][1],target[i]);
            s.setCharAt(command[i][1], target[i]);
          } else if(i == UorLIndex){
            if(UorL == 2){
              s.toString().toUpperCase();
            } else if(UorL == 3){
              s.toString().toLowerCase();
            }
          } else if(UorLIndex == -1){
            s.toString();
          }
        }
        System.out.println(s);
    }
}