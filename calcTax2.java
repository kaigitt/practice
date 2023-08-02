import java.util.*;

/*・0 ~ 100,000 に対しては、税金がかかりません。
・100,001 ~ 750,000 に対して 10 % の税率がかかり税金は 65,000 です。
・750,001 ~ 850,000 に対して 20 % の税率がかかり税金は 20,000 です。
*/

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] taxList = {{100000, 10}, {750000, 20}, {1500000, 40}};
        int[] incomes = new int[n];
        for (int i = 0; i < incomes.length; i ++) {
            incomes[i] = sc.nextInt();
        }
        
        int totalTax = 0;
        
        for (int i = 0; i < incomes.length ; i++ ) {
            for (int j = 0; j < taxList.length ; j++ ) {
                if (j+1 < taxList.length && taxList[j+1][0] < incomes[i]) {
                    totalTax += (taxList[j+1][0] - taxList[j][0]) * taxList[j][1] / 100;
                } else if (taxList[j][0] < incomes[i]) {
                    totalTax += (incomes[i] - taxList[j][0]) * taxList[j][1] / 100;
                }
            }  
        } 
        
        System.out.println(totalTax);
    }
} 