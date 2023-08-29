import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] cards = new int[h][w];
        boolean[][] status = new boolean[h][w];
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
            cards[i][j] = sc.nextInt();
            status[i][j] = false;
          }
        }
        int[] playerPoint = new int[n];


        boolean continuousFlag = true;
        int player = 0;
        int m = sc.nextInt();
        int cardA1 = 0;
        int cardA2 = 0;
        int cardB1 = 0;
        int cardB2 = 0;
        for (int i = 0; i < m; i++) {
          //入力
          cardA1 = sc.nextInt() - 1;
          cardA2 = sc.nextInt() - 1;
          cardB1 = sc.nextInt() - 1;
          cardB2 = sc.nextInt() - 1;
          System.out.print(i + "  ");
          
          
          System.out.println(player);


          if(cards[cardA1][cardA2] == cards[cardB1][cardB2]){
            continuousFlag = true;
            playerPoint[player] += 2;
          } else {
            continuousFlag = false;
          }
          //プレイヤーチェンジ
          if(continuousFlag == false){
            player = (player+1) % n;
          }
        }
        for (int x: playerPoint) {
          System.out.println(x);
        }
    }
}