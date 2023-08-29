import java.util.*;
public class Main {
    public static void main(String[] args) {
        // �����̓��ӂȌ����
        // Let's �`�������W�I�I
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] seatsBooked = new boolean[n];

        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < m; i++) {
          endIndex = sc.nextInt();
          startIndex = sc.nextInt() - 1;
          endIndex += startIndex - 1;
          boolean allEmpty = true;
          for (int j = startIndex; j < endIndex + 1; j++) {
            
            if(j > n - 1){
                if(seatsBooked[j % n] == true){
                  allEmpty = false;
                }
              } else {
                if(seatsBooked[j] == true){
                  allEmpty = false;
                }
              }
            
          }

          if(allEmpty){
            //�S�����̈֎q�������Ă�����֎q�𖄂߂鏈��
            for (int j = startIndex; j < endIndex + 1; j++) {
              if(j > n - 1){
                seatsBooked[j % n] = true;
              } else {
                seatsBooked[j] = true;
              }
            }
          }
        }

        int total = 0;
        for(boolean flag: seatsBooked){
          if(flag){
            total++;
          }
        }

        System.out.println(total);
    }
}