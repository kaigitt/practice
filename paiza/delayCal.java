import java.util.*;
public class Main {
    public static void main(String[] args) {
        // unfinished
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][3];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < 3; j++) {
            nums[i][j] = sc.nextInt();
          }
        }

        int m = sc.nextInt();
        int[] t = new int[m];
        int maxT = 0;
        for (int i = 0; i < m; i++) {
          t[i] = sc.nextInt();
          if(t[i] > maxT){
            maxT = t[i];
          }
        }
        //System.out.println(maxT);



        //ˆ—ŠJn
        int[][] realTime = new int[n][2];
        int[][] delayTime = new int[n][2];
        for (int i = 0; i < n; i++) {
          realTime[i][0] = nums[i][0];
          realTime[i][1] = nums[i][2];
          delayTime[i][0] = nums[i][0] + nums[i][1];
          delayTime[i][1] = nums[i][2];
          //System.out.println(nums[i][0] + nums[i][1] + "####" + delayTime[i][0]);
        }

        Arrays.sort(delayTime, Comparator.comparingInt(a -> a[0]));

        
        for (int i = 1; i < n; i++) {
          realTime[i][1] += realTime[i-1][1] ;
          delayTime[i][1] += delayTime[i-1][1];
          //System.out.println(nums[i][0] + nums[i][1] + "####" + delayTime[i][0]);
        }

        for (int i = 0; i < n; i++) {
          //System.out.println(realTime[i][0] + " " + realTime[i][1]);
          System.out.println(delayTime[i][0] + " " + delayTime[i][1]);
        }
        for (int i = 0; i < n; i++) {
          System.out.println(realTime[i][0] + " " + realTime[i][1]);
          //System.out.println(delayTime[i][0] + " " + delayTime[i][1]);
        }
        
        for (int i = 0; i < m; i++) {
          t[i];
        }
          
        
    }
}