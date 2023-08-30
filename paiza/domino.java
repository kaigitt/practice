import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] domino = new int[h][w];
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
            domino[i][j] = sc.nextInt();
          }
        }
        int maxNum = 0;
        for (int j = 0; j < w; j++) {
          int subtototal = search(domino, 0, j, h, w);
          maxNum = Math.max(maxNum, subtototal);
          System.out.println(subtototal);
        }

        System.out.println(maxNum);

    }

    public static int search(int[][] domino,int i, int j, int h, int w){
      if(i < 0 || i >= h || j < 0 || j >= w){
        return 0;
      }

      int currentScore = domino[i][j];

      int subA = search(domino, i+1, j, h, w);
      int subB = search(domino, i+1, j-1, h, w);
      int subC = search(domino, i+1, j+1, h, w);
      int maxScore = Math.max(Math.max(subA, subB), subC);
      return maxScore + currentScore;
    }
}