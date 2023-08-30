import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] harvest = new int[h][w];

        int n = sc.nextInt();
        int T = 0;
        int x = 0;
        int y = 0;
        
        for (int z = 0; z < n; z++) {
          T = sc.nextInt();
          x = sc.nextInt() - 1;
          y = sc.nextInt() - 1;
          x = x - (T-1)/2;
          y = y - (T-1)/2;

            for (int i = y; i < y+T; i++) {
              for (int j = x; j < x+T; j++) {
                //if(i >= 0 && j >= 0 && i < h && j < w){
                  if(i == y || j == x || i == y+T-1 || j == x+T-1){
                    if(i >= 0 && j >= 0 && i < h && j < w){
                      harvest[i][j]++;
                    }
                    
                  }
                //}
                
              }
            }
        
        }
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              if(j != w-1){
                  System.out.print(harvest[i][j] + " ");
              } else {
                  System.out.print(harvest[i][j]);
              }
          }
          System.out.println();
        }
    }
}