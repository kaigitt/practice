import java.util.*;

public class CollatzProblem {
    public static void main(String[] args) {
      int num = 0;
      int count = 0;
      for (int i = 1; i <= 10000; i++) {
        num = i;
        do {
          //System.out.println(num);
          if(num % 2 == 0){
            //�����̏ꍇ
            if(i == num){
              num = num * 3 + 1;
            } else {
              num /= 2;
            }
          } else {
            //��̏ꍇ
            num = num * 3 + 1; 
          }
          
          if(i == num){
            //�����Ɠ����l�ɂȂ�����break
            count++;
            num = 1;
          }
        } while(num != 1);
      } 
      System.out.println(count);
    }
}
