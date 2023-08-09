import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] seaMap = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seaMap[i][j] = sc.nextInt();
            }
        }

        int netHeight = sc.nextInt();
        int netWidth = sc.nextInt();
        char[][] net = new char[netHeight][netWidth];
        for (int i = 0; i < netHeight; i++) {
            net[i] = sc.next().toCharArray();
        }

        int maxFishAmount = 0;
        // 探索開始
        for (int i = 0; i < n - netHeight + 1; i++) {
            for (int j = 0; j < m - netWidth + 1; j++) {
                int fishAmount = getFishAmount(i, j, net, seaMap);
                maxFishAmount = Math.max(maxFishAmount, fishAmount);
            }
        }

        System.out.println(maxFishAmount);
    }

    static int getFishAmount(int x, int y, char net[][], int seaMap[][]) {
        int fishAmount = 0;

        for (int i = 0; i < net.length; i++) {
            for (int j = 0; j < net[0].length; j++) {
                if (net[i][j] == '#') {
                    fishAmount += seaMap[x + i][y + j];
                }
            }
        }

        return fishAmount;
    }
}
