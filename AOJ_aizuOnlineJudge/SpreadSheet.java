import java.util.*;

public class SpreadSheet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] sheet = new int[n+1][m+1];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            sheet[i][j] = sc.nextInt();
            if(j == m-1){
              sheet[i][j+1] = 0;
            }
            if(i == n-1){
              sheet[i+1][j] = 0;
            }
          }
        }

        //列合計計算
        for (int i = 0; i < n+1; i++) {
          int subTotal = 0;
          for (int j = 0; j < m+1; j++) {
            subTotal += sheet[i][j];
            if(j == m){
              sheet[i][j] = subTotal;
            }
          }
        }

        //行合計計算
        for (int j = 0; j < m+1; j++) {
          int subTotal = 0;
          for (int i = 0; i < n+1; i++) {
            subTotal += sheet[i][j];
            if(i == n){
              sheet[i][j] = subTotal;
            }
          }
        }

        for (int i = 0; i < n+1; i++) {
          for (int j = 0; j < m+1; j++) {
            if(j < m){
              System.out.print(sheet[i][j] + " ");
            } else {
              System.out.print(sheet[i][j]);
            }
          }
          System.out.println("");
        }

    }
}
