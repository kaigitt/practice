import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] prices = new int[n];
        int[] count = new int[n];
        int[][] function = new int[n][m];
        
        for (int i = 0; i < n; i++) {
          prices[i] = sc.nextInt();
          count[i] = sc.nextInt();
          for (int j = 0; j < count[i]; j++) {
            function[i][j] = sc.nextInt();
          }
        }
        boolean allFlag = false;
        for (int i = 0; i < n; i++) {
          for (int j = i; j < n; j++) {
           // System.out.println(i + " " + j);
            //�S�T��
            if(prices[i] >= prices[j]){
              //pi >= p2�ł���
              boolean flag = true;

              System.out.println("$$$$$");
              for (int tmp : function[i]) {
                //j �Ԗڂ̐��i�� i �Ԗڂ̐��i�����@�\�����ׂĂ��B
                System.out.println(tmp);
                if(!(Arrays.asList(function[j]).contains(tmp))){
                  flag = false;
                }
                if(flag){
                  System.out.println(i + " " + j);
                }
                if(flag && (prices[i] > prices[j] || count[i] > count[j])){
                  allFlag = true;
                }
              }
              
            }
          }
        }

        System.out.println(allFlag);
        if(allFlag){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }

    }
}
