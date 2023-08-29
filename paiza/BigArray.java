import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Integer> count = new ArrayList<>();
        int[][] tmp = new int[n][2];
        for (int z = 0; z < n; z++) {
            tmp[z][0] = sc.nextInt();
            tmp[z][1] = sc.nextInt();
        }
        
        Arrays.sort(tmp, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < tmp.length; i++) {
          System.out.print(tmp[i][0] + " ");
          System.out.println(tmp[i][1]);
        }


        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < tmp.length; i++) {
          for (int j = 0; j < tmp[i][1]; j++) {
            arr.add(tmp[i][0]);
          }
        }

        System.out.println(arr.get(k-1));
    }
}