import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map1 = new char[h][w];
        for (int i = 0; i < h; i++) {
          String tmp = sc.next();
          for (int j = 0; j < w; j++) {
            map1[i] = tmp.toCharArray();
          }
        }
        
        //ŠO‘¤‚ð#‚Å–„‚ß‚é
        char[][] map = new char[h+2][w+2];
        for (int i = 0; i < h+2; i++) {
          for (int j = 0; j < w+2; j++) {
            if(i == 0 || j == 0 || i == h+1 || j == w+1){
              map[i][j] = '#';
            } else {
              map[i][j] = map1[i - 1][j - 1];
            }
          }
        }

        //”»’è
        for (int i = 1; i < h + 1; i++) {
          for (int j = 1; j < w + 1; j++) {
            if(map[i-1][j] == '#' && map[i+1][j] == '#' && map[i][j-1] == '#' && map[i][j+1] == '#'){
              System.out.println((i-1) + " " + (j-1));
            }
          }
        }
    }
}