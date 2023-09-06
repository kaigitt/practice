import java.util.*;
public class Main {
  static int H, W;
  static int[][] field;
  static boolean[][] seen;
  static int[] dx = {1, 0, -1, 0};
  static int[] dy = {0, 1, 0, -1};

  public static void dfs(int h, int w){

  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()){
        W = sc.nextInt();
        H = sc.nextInt();
        field = new int[H][W];
        seen = new boolean[H][W];

        for (int i = 0; i < H; i++) {
          for (int j = 0; j < W; j++) {
            field[i][j] = sc.nextInt();
          }
        }
        for (int i = 0; i < H; i++) {
          for (int j = 0; j < W; j++) {
            System.out.print(field[i][j]);
          }
          System.out.println();
        }
      }
      

      
  }
}