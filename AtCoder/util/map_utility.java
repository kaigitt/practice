import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        
        int[][] S = new int[h][w];
        int num = 1;
        
        if(d == 1){
            for (int i = 0; i < h; i++){
                for (int a = 0; a < Math.min(h,w); a++){
                    System.out.println(i + " " + a);
                    if(i - a >= 0 && i - a < w){
                        S[i - a][0 + a] = num;
                        num++;
                    }
                } 
                System.out.println();
            }
            for (int j = 1; j < w; j++) {
                for (int a = 0; a < Math.min(h,w); a++) {
                    if (h - 1 - a >= 0 && j + a < w) {
                        S[h - 1 - a][j + a] = num;
                        num++;
                    }
                }
            }
        }
        
        if(d == 2){
            
        }
        
        if(d == 3){
            for (int i = 0; i < h; i++){
                for (int j = 0; j < w; j++){
                    //System.out.print(j);
                } 
                
            }
        }
        if(d == 4){
            
        }
        
         for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                System.out.print(S[i][j]);
            }
            System.out.println();
        }
        
        //“ü—Í‚¢‚ë‚¢‚ë
        /*
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++){
            String tmp = sc.next();
            for (int j = 0; j < w; j++){
                map[i] = tmp.toCharArray();
            } 
        }
        int[] current = new int[2];
        int y = sc.nextInt();
        int x = sc.nextInt();
        */
        
        //c‚Æ‰¡‚Ìˆ—
        /*
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if(i == y || j == x){
                    if(map[i][j] == '#'){
                        map[i][j] = '.';
                    } else if(map[i][j] == '.' ){
                        map[i][j] = '#';
                    }
                }
            } 
        }
        */
        
        
        //ŽÎ‚ß‚Ìˆ—
        /*
        for (int i = 1; i < Math.min(h, w); i++){
             if(y + i < h){
                 //‘æŽlÛŒÀ
                 if(x + i < w){
                     if(map[y+i][x+i] == '#'){
                         map[y+i][x+i] = '.';
                     } else {
                         map[y+i][x+i] = '#';
                     }
                 }
                 //‘æŽOÛŒÀ
                 if(0 <= x - i){
                     if(map[y+i][x-i] == '#'){
                         map[y+i][x-i] = '.';
                     } else {
                         map[y+i][x-i] = '#';
                     }
                 }
             }
             if(0 <= y + i){
                 //‘æ“ñÛŒÀ
                 if(x + i < w-1){
                     if(map[y-i][x+i] == '#'){
                         map[y-i][x+i] = '.';
                     } else {
                         map[y-i][x+i] = '#';
                     }
                 }
                 //‘æˆêÛŒÀ
                 if(0 <= x - i){
                     if(map[y-i][x-i] == '#'){
                         map[y-i][x-i] = '.';
                     } else {
                         map[y-i][x-i] = '#';
                     }
                 }
             }
        }
        */
        
        /*o—Í‚¢‚ë‚¢‚ë
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        */
    }
}