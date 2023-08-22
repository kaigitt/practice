import java.util.*;

public class CutBar {
    public static void main(String[] args) {
      System.out.println(cutBar(3, 8, 1));
    }

    public static int cutBar(int m , int n, int current){
      //本数が長さと同じになったら終了
      if(current >= n){
        return 0;
      } else if(current < m){
        //切る人の数より本数が少なければ、できる限り切ることができるから、本数が二倍になる
        return 1 + cutBar(m, n, current * 2);
      } else {
        return 1 + cutBar(m, n, current + m);
      }
    }
}
