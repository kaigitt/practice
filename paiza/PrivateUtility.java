import java.util.*;
public class PrivateUtility {
    public static void main(String[] args) {
        // �����̓��ӂȌ����
        // Let's �`�������W�I�I
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findSumOfDigits(n));
        
    }

    //10�i�@�\�L�̊e���̍��v�����߂�
    public static int findSumOfDigits(int n){
      int sum = 0;
      while(n > 0){
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }
}