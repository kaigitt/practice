import java.util.*;
public class Main {
    public static void main(String[] args) {
        // unfinished
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        int startx = 0;
        int starty = 0;
        for (int i = 0; i < h; i++) {
          String tmp = sc.next();
          for (int j = 0; j < w; j++) {
            map[i] = tmp.toCharArray();
            if(map[i][j] == 'S'){
              startx = i;
              starty = j;
            }
          }
        }

        boolean canEscape = dfs(map, startx, starty, h ,w );
        
        if(canEscape){
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
    }

    public static boolean dfs(char[][] map, int row, int col, int h, int w){
      //終了条件
       //範囲外に出た場合 脱出成功
       if(row < 0 || h <= row || col < 0 || w <= w){
        return true;
       }

       //踏んでいるマスが#のとき 失敗
       if(map[row][col] == '#'){
        return false;
       }

       map[row][col] = '#';

       boolean up = dfs(map, row - 1, col, h, w);
       boolean down = dfs(map, row + 1, col, h, w);
       boolean right = dfs(map, row, col + 1, h, w);
       boolean left = dfs(map, row, col - 1, h, w);

       if(up || down || right || left){
        return true;
       }

       return false;
    }
}