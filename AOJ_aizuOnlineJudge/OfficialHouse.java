import java.util.*;

public class OfficialHouse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] maison = new int[4][3][10];
        for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 10; k++) {
              maison[i][j][k] = 0;
            }
          }
        }
        //４つの整数b, f, r, vが与えられます。これは、b棟f階のr番目の部屋にv人が追加で入居したことを示します。vが負の値の場合、-v人退去したことを示します。
        int b = 0;
        int f = 0;
        int r = 0;
        int v = 0;
        for (int i = 0; i < n; i++) {
          b = sc.nextInt();
          f = sc.nextInt();
          r = sc.nextInt();
          v = sc.nextInt();
          maison[b-1][f-1][r-1] += v;
          
        }


        for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 10; k++) {
              System.out.print(" " + maison[i][j][k]);
            }
            System.out.println("");
          }
          if(i<3){
            System.out.println("####################");
          }
        }
    }
}
