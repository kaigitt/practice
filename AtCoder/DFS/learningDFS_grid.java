import java.util.*;
public class Main {
  static int H, W;
  static char[][] field;
  static boolean[][] seen;

  // 4方向のベクトル
  static int[] dx = {1, 0, -1, 0};
  static int[] dy = {0, 1, 0 ,-1};

  //探索
  static void dfs(int h, int w){
    seen[h][w] = true; //探索済みにする

    //四方向を探索
    for (int dir = 0; dir < 4; dir++) {
      int nh = h + dx[dir];
      int nw = w + dy[dir];

      //場外アウトしたり、移動先が壁の場合はスルー
      if(nh < 0 || nh >= H || nw < 0 || nw >= W) continue;
      if(field[nh][nw] == '#') continue;

      //探索済みの場合
      if(seen[nh][nw]) continue;

      //再帰的に探索
      dfs(nh, nw);
    }

  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      H = sc.nextInt();
      W = sc.nextInt();
      field = new char[H][W];
      seen = new boolean[H][W];

      for (int i = 0; i < H; i++) {
        field[i] = sc.next().toCharArray();
      }

      //s g のマスを特定する
      int sh = 0, sw = 0, gh = 0, gw = 0;
      for (int h = 0; h < H; h++) {
        for (int w = 0; w < W; w++) {
          if(field[h][w] == 's'){
            sh = h;
            sw = w;
          }
          if(field[h][w] == 'g'){
            gh = h;
            gw = w;
          }
        }
      }
      

      //探索開始
      for (int h = 0; h < H; h++) {
        for (int w = 0; w < W; w++) {
          seen[h][w] = false;
        }
      }
      dfs(sh, sw); //sの位置からスタート

      //結果
      if(seen[gh][gw]){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}