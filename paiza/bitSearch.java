import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = m;
        int[] prices = new int[n];
        for (int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
         // �����O�̎������擾
        long startTime = System.currentTimeMillis();

        //�r�b�g�S�T��
        for (int bit = 0; bit < (1 << n); bit++) {
            int currentTotal = 0;
            for (int i = 0; i < n; i++) {
                if ((1 & (bit >> i)) > 1) {
                    currentTotal += prices[i];
                }
            }

        }

        // ������̎������擾
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime+ " ms");
        
    }
}
