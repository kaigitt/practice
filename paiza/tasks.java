import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] tasks = new int[N][3];
        boolean[] schedule = new boolean[1001];
        boolean flag = true;
        for (int i = 0; i < N; i++) {
          int time = sc.nextInt();
          int startDay = sc.nextInt();
          int deadline = sc.nextInt();

          for (int j = startDay; j <= deadline; j++) {
            if(time <= 0){
              break;
            }
            if(schedule[j]){
              continue;
            } else {
              System.out.println(j);
              schedule[j] = true;
              time--;
            }
          
          }

          if(time != 0){
            flag = false;
          }
        }

        if(flag){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}