import java.util.*;
public class Main {
  static int H, W;
  static char[][] field;
  static boolean[][] seen;

  // 4�����̃x�N�g��
  static int[] dx = {1, 0, -1, 0};
  static int[] dy = {0, 1, 0 ,-1};

  //�T��
  static void dfs(int h, int w){
    seen[h][w] = true; //�T���ς݂ɂ���

    //�l������T��
    for (int dir = 0; dir < 4; dir++) {
      int nh = h + dx[dir];
      int nw = w + dy[dir];

      //��O�A�E�g������A�ړ��悪�ǂ̏ꍇ�̓X���[
      if(nh < 0 || nh >= H || nw < 0 || nw >= W) continue;
      if(field[nh][nw] == '#') continue;

      //�T���ς݂̏ꍇ
      if(seen[nh][nw]) continue;

      //�ċA�I�ɒT��
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

      //s g �̃}�X����肷��
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
      

      //�T���J�n
      for (int h = 0; h < H; h++) {
        for (int w = 0; w < W; w++) {
          seen[h][w] = false;
        }
      }
      dfs(sh, sw); //s�̈ʒu����X�^�[�g

      //����
      if(seen[gh][gw]){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}