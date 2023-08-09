import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        //円の範囲が0以上である条件を忘れないよう
        if(0 < y+r && y+r <= H && 0 < x+r && x+r <=W){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
    
}