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
        
        
        //‰æ‘œˆ—
        for(char x: operation){
            if(x == 'D'){
                dirationPicture(picture, h, w);
            } else if(x == 'E') {
                erosionPicture(picture, h, w);
            }
        }
        
        //o—Í
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              System.out.print(picture[i][j]);
          } 
          System.out.println("");
        }
    }
    
    public static void dirationPicture(char[][] picture, int h, int w){
        //diration’†‚Ìˆ—
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              if(picture[i][j] == '#'){
                  //ã•ûŒü‚Ìˆ—
                  if(0 < i && picture[i - 1][j] != '#'){
                      picture[i - 1][j] = '*';
                  }
                  //‰º•ûŒü‚Ìˆ—
                  if(i < h - 1 && picture[i + 1][j] != '#'){
                      picture[i + 1][j] = '*';
                  }
                  //¶•ûŒü‚Ìˆ—
                  if(0 < j && picture[i][j - 1] != '#'){
                      picture[i][j - 1] = '*';
                  }
                  //‰E•ûŒü‚Ìˆ—
                  if(j < w - 1 && picture[i][j + 1] != '#'){
                      picture[i][j + 1] = '*';
                  }
              }
          } 
        }
        
        //dirationÅŒã‚Ìˆ—
        for (int i = 0; i < h; i++) {
           for (int j = 0; j < w; j++) {
                if(picture[i][j] == '*'){
                    picture[i][j] = '#';
                }
            }
        } 

    } 
    
    
    public static void erosionPicture(char[][] picture, int h, int w){
        //erosion’†‚Ìˆ—
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              boolean findWhite = false;
              if(picture[i][j] == '#'){
                  
                  //ã•ûŒü‚Ìˆ—
                  if(0 < i && picture[i - 1][j] == '.'){
                      picture[i][j] = '*';
                  }
                  //‰º•ûŒü‚Ìˆ—
                  if(i < h - 1 && picture[i + 1][j] == '.'){
                      picture[i][j] = '*';
                  }
                  //¶•ûŒü‚Ìˆ—
                  if(0 < j && picture[i][j - 1] == '.'){
                      picture[i][j] = '*';
                  }
                  //‰E•ûŒü‚Ìˆ—
                  if(j < w - 1 && picture[i][j + 1] == '.'){
                      picture[i][j] = '*';
                  }
              }
        }
        }
        //erosionÅŒã‚Ìˆ—
        for (int i = 0; i < h; i++) {
           for (int j = 0; j < w; j++) {
                if(picture[i][j] == '*'){
                    picture[i][j] = '.';
                }
            }
        } 
    }
    
    
}