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
        
        
        //�摜����
        for(char x: operation){
            if(x == 'D'){
                dirationPicture(picture, h, w);
            } else if(x == 'E') {
                erosionPicture(picture, h, w);
            }
        }
        
        //�o��
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              System.out.print(picture[i][j]);
          } 
          System.out.println("");
        }
    }
    
    public static void dirationPicture(char[][] picture, int h, int w){
        //diration���̏���
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              if(picture[i][j] == '#'){
                  //������̏���
                  if(0 < i && picture[i - 1][j] != '#'){
                      picture[i - 1][j] = '*';
                  }
                  //�������̏���
                  if(i < h - 1 && picture[i + 1][j] != '#'){
                      picture[i + 1][j] = '*';
                  }
                  //�������̏���
                  if(0 < j && picture[i][j - 1] != '#'){
                      picture[i][j - 1] = '*';
                  }
                  //�E�����̏���
                  if(j < w - 1 && picture[i][j + 1] != '#'){
                      picture[i][j + 1] = '*';
                  }
              }
          } 
        }
        
        //diration�Ō�̏���
        for (int i = 0; i < h; i++) {
           for (int j = 0; j < w; j++) {
                if(picture[i][j] == '*'){
                    picture[i][j] = '#';
                }
            }
        } 

    } 
    
    
    public static void erosionPicture(char[][] picture, int h, int w){
        //erosion���̏���
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              boolean findWhite = false;
              if(picture[i][j] == '#'){
                  
                  //������̏���
                  if(0 < i && picture[i - 1][j] == '.'){
                      picture[i][j] = '*';
                  }
                  //�������̏���
                  if(i < h - 1 && picture[i + 1][j] == '.'){
                      picture[i][j] = '*';
                  }
                  //�������̏���
                  if(0 < j && picture[i][j - 1] == '.'){
                      picture[i][j] = '*';
                  }
                  //�E�����̏���
                  if(j < w - 1 && picture[i][j + 1] == '.'){
                      picture[i][j] = '*';
                  }
              }
        }
        }
        //erosion�Ō�̏���
        for (int i = 0; i < h; i++) {
           for (int j = 0; j < w; j++) {
                if(picture[i][j] == '*'){
                    picture[i][j] = '.';
                }
            }
        } 
    }
    
    
}