import java.util.*;

public class MatrixVectorMaltiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int[] vector = new int[m];

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            matrix[i][j] = sc.nextInt();
          }
        }

        for (int i = 0; i < m; i++) {
          vector[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
          int subTotal = 0;
          for (int j = 0; j < m; j++) {
            subTotal += matrix[i][j] * vector[j];
          }
          System.out.println(subTotal);
        }
      
    }
}
