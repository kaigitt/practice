import java.util.*;
public class Main {
    public static void main(String[] args) {
        // unfinished
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tail = new int[n][n];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            tail[i][j] = sc.nextInt();
          }
        }

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            
          }
        }
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int s = sc.nextInt();
        int d = sc.nextInt();
        //‘ÎÛ”ÍˆÍ
        int[][] tmpMap = new int[s][s];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            if(i >= r && j >= c && i < r + s && j < c + s){
              list.add(tail[i][j]);
            }
          }
        }

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            if(i >= r && j >= c && i < r + s && j < c + s){
              System.out.print(tail[j][i] + " ");
            } else {
              System.out.print(tail[i][j] + " ");
            }
          }
          System.out.println();
        }

        //‘ÎÛ”ÍˆÍ•ÏŒ`
        //90
        if(d == 90){
          
        }
        //180
        if(d == 180){
          Collections.reverse(list);
          int z = 0;
          for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            if(i >= r && j >= c && i < r + s && j < c + s){
              tail[i][j] = list.get(z);
              z++;
            }
          }
          }
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              //System.out.print(tail[i][j] + " ");
            }
          //System.out.println();
          }
        
        }

        //270
        if(d == 270){
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              //System.out.print(tail[j][i] + " ");
            }
          //System.out.println();
          }
        }

        //360
          //‰½‚à‚µ‚È‚¢
          if(d == 360){

          }

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            //System.out.print(tail[i][j] + " ");
          }
          //System.out.println();
        }
        
    }
}