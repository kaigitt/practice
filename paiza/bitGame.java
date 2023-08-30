import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[][] bit = new boolean[n][3];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < 3; j++) {
            if(sc.nextInt() == 1){
              bit[i][j] = true;
            } else {
              bit[i][j] = false;
            }
            
          }
        }

        String command = "";
        boolean[] q = new boolean[3];
        for (int i = 0; i < m; i++) {
          command = sc.next();
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(a == 1){ q[0] = true; } else { q[0] = false; }
          if(b == 1){ q[1] = true; } else { q[1] = false; }
          if(c == 1){ q[2] = true; } else { q[2] = false; }

          for (int k = 0; k < n; k++) {
                for (int j = 0; j < bit.length; j++) {
                  if(command.equals("a")){
                         if(bit[k][j] || q[j]){
                           bit[k][j] = true;
                         } else {
                           bit[k][j] = false;
                         }
                   } else if(command.equals("b")){
                         if(bit[k][j] && q[j]){
                           bit[k][j] = true;
                         } else {
                           bit[k][j] = false;
                         }
                   } else if(command.equals("c")){
                         if(bit[k][j] != q[j]){
                           bit[k][j] = true;
                         } else {
                           bit[k][j] = false;
                         }
                   }
                }
          }
        }

        //10進数を作成
        int[] result = new int[n];
        int maxNum = 0;
        for (int j = 0; j < n; j++) {
            for (int j2 = 0; j2 < 3; j2++) {
              if(bit[j][j2]){
                if(j2 == 0){
                  result[j] += 100;
                } else if(j2 == 1){
                  result[j] += 10;
                } else {
                  result[j] += 1;
                }
              }
            }
            maxNum = Math.max(maxNum, result[j]);
          }



          for (int i = 0; i < n; i++){
            if(result[i] == maxNum){
              System.out.println(i+1);
            }
          }
    }
}