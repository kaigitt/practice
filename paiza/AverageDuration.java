import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int duration = sc.nextInt();
        int[] visitedNumDutati = new int[n];
        for (int i = 0; i < n; i++){
            visitedNum[i] = sc.nextInt();
        }
        
        int maxVisited = 0;
        int maxVisitedIndex = 0;
        int canditateNum = 0;
        for (int i = 0; i < n-duration+1; i++){
            int totalVisited = 0;
            for (int j = i; j < duration+i; j++){
                //System.out.println(visitedNum[j]);
                totalVisited += visitedNum[j];
            }
            if(maxVisited < totalVisited){
                maxVisited = totalVisited;
                maxVisitedIndex = i+1;
                canditateNum = 0;
                canditateNum++;
            } else if(maxVisited == totalVisited){
                canditateNum++;
            }
        }
        
        System.out.println(canditateNum + " " + maxVisitedIndex);
        
    }
}