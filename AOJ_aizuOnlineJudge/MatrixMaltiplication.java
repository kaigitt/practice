import java.util.*;

public class MatrixMaltiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] arrA = new int[n][m];
        int[][] arrB = new int[m][l];
        int[][] arrC = new int[n][l];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            arrA[i][j] = sc.nextInt();
            //System.out.print(arrA[i][j]);
          }
        }

        for (int i = 0; i < m; i++) {
          for (int j = 0; j < l; j++) {
            arrB[i][j] = sc.nextInt();
            //System.out.print(arrB[i][j]);
          }
        }

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            arrC[i][j] = 0;
            //System.out.print(arr[i][j]);
          }
        }


        int subTotal = 0;
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            for (int k = 0; k < l; k++) {

              //arrC[i][j] = arrA[i][k] * arrB[k][j];
              System.out.println(arrC[i][j] + "=" + arrA[l][j] +  "*" );
            }
            
          }
        }

        //出力
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < l; j++) {
            if(j == l-1){
              //System.out.print(arrC[i][j]);
            } else {
              ///System.out.print(arrC[i][j] + " ");
            }
          }
          //System.out.println("");
        }
    }
}
