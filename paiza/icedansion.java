import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] field = new char[H][W];
        for (int i = 0; i < H; i++) {
          String tmp = sc.next();
          field[i] = tmp.toCharArray();
        }
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        int N = sc.nextInt();
        System.out.println(y);
        for (int i = 0; i < N; i++) {
          String dir = sc.next();
          if(dir.equals("U")){
            y--;
            while(y > 0){
              if(field[y][x] == '.'){
                break;
              }
              y--;
            }
          } else if (dir.equals("R")){
            x++;
            while(x <= W){
              if(field[y][x] == '.'){
                break;
              }
              x++;
            }
          } else if (dir.equals("D")){
            y++;
            while(y <= H){
              if(field[y][x] == '.'){
                break;
              }
              y++;
            }
          } else if (dir.equals("L")){
            x--;
            while(0 < x){
              if(field[y][x] == '.'){
                break;
              }
              x--;
            }
          }
          
        }

        System.out.println(x+1 + " " + (y+1));
    }
}