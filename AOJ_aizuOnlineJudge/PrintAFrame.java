import java.util.*;

public class PrintAFrame {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int h = 0;
    int w = 0;
    while(sc.hasNextInt()){
      h = sc.nextInt();
      w = sc.nextInt();
      if(h == 0 && w == 0){ break; }
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if(i == 0 || i == h-1){
            System.out.print("#");
          } else {
            if(j == 0 || j == w-1){
              System.out.print("#");
            } else {
              System.out.print(".");
            }
          }
        }
        System.out.println("");
      }
      System.out.println("");
    }
  }
}
