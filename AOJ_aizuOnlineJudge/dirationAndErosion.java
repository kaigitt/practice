import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        char[][] picture = new char[h][w];
        sc.nextLine();
        for (int i = 0; i < h; i++) {
          picture[i] = sc.nextLine().toCharArray();
        }

        char[] operation = new char[n];
        operation = sc.nextLine().toCharArray();
        
        
        //画像処理
        for(char x: operation){
            if(x == 'D'){
                dirationPicture(picture, h, w);
            } else if(x == 'E') {
                erosionPicture(picture, h, w);
            }
        }
        
        //出力
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              System.out.print(picture[i][j]);
          } 
          System.out.println("");
        }
    }
    
    public static void dirationPicture(char[][] picture, int h, int w){
        //diration中の処理
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              if(picture[i][j] == '#'){
                  //上方向の処理
                  if(0 < i && picture[i - 1][j] != '#'){
                      picture[i - 1][j] = '*';
                  }
                  //下方向の処理
                  if(i < h - 1 && picture[i + 1][j] != '#'){
                      picture[i + 1][j] = '*';
                  }
                  //左方向の処理
                  if(0 < j && picture[i][j - 1] != '#'){
                      picture[i][j - 1] = '*';
                  }
                  //右方向の処理
                  if(j < w - 1 && picture[i][j + 1] != '#'){
                      picture[i][j + 1] = '*';
                  }
              }
          } 
        }
        
        //diration最後の処理
        for (int i = 0; i < h; i++) {
           for (int j = 0; j < w; j++) {
                if(picture[i][j] == '*'){
                    picture[i][j] = '#';
                }
            }
        } 

    } 
    
    
    public static void erosionPicture(char[][] picture, int h, int w){
        //erosion中の処理
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              boolean findWhite = false;
              if(picture[i][j] == '#'){
                  
                  //上方向の処理
                  if(0 < i && picture[i - 1][j] == '.'){
                      picture[i][j] = '*';
                  }
                  //下方向の処理
                  if(i < h - 1 && picture[i + 1][j] == '.'){
                      picture[i][j] = '*';
                  }
                  //左方向の処理
                  if(0 < j && picture[i][j - 1] == '.'){
                      picture[i][j] = '*';
                  }
                  //右方向の処理
                  if(j < w - 1 && picture[i][j + 1] == '.'){
                      picture[i][j] = '*';
                  }
              }
        }
        }
        //erosion最後の処理
        for (int i = 0; i < h; i++) {
           for (int j = 0; j < w; j++) {
                if(picture[i][j] == '*'){
                    picture[i][j] = '.';
                }
            }
        } 
    }
    
    
}