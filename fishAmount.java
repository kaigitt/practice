import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] seaMap = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m ;j++ ){
                seaMap[i][j] = sc.nextInt();
            } 
        }
        
        int netHeight = sc.nextInt();
        int netWidth = sc.nextInt();
        char[][] net = new char[netHeight][netWidth];
        for (int i = 0; i < netHeight; i++){
            net[i] = sc.next().toCharArray();
            for (int j = 0; j < netWidth ;j++ ){
            } 
        }
        
        int MaxfishAmount = 0;
        //探索開始
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m ;j++ ){
                int fishAmount = 0;
                //fishAmount 漁獲量
                //seaMap[i][j];
                fishAmount += dfs(i, j, net, seaMap);
                
                if(MaxfishAmount < fishAmount){
                    MaxfishAmount = fishAmount;
                }
            } 
        }
        
        System.out.println(MaxfishAmount);
    }
    
    static int dfs(int i, int j, char net[][],int seaMap[][]){
        int fishAmount = 0;
        
        if(i + net.length > seaMap.length || j + net[0].length > seaMap[0].length ){
            return 0;
        }
        
        for (int k = 0; k < net.length; k++){
            for (int l = 0; l < net[0].length ;l++ ){
                if(Character.toString(net[k][l]).equals("#")){
                    fishAmount += seaMap[i+k][j+l];
                }
            } 
        }
        
        return fishAmount;
    }
}