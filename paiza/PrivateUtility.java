import java.util.*;
public class PrivateUtility {
    public static void main(String[] args) {
        // �����̓��ӂȌ����
        // Let's �`�������W�I�I
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n / 2 + n % 2);
        System.out.println((n + 2 - 1)/ 2);
        //a�l��b�l���̃O���[�v�ɕ�����Ƃ�,�]�����l�͈�̃O���[�v�Ƃ��ĉ��O���[�v�ł���̂�
        //x = (a + b - 1)/ b
        System.out.println((17 + 3 - 1)/ 3);
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

    //n���f�����ǂ����𔻒肷��
    public static boolean isPrime(int n){
      //���[�v�̏�����i*i�ƂȂ��Ă���̂� n���f������Ȃ����n�̖񐔂�sqrt(n)��菬�����l�ɑ��݂��邩��(i*i�܂ł����ɂ񂷂�΂���)
      for (int i = 2; i*i < n; i++) {
        if(n % i == 0){
          return false;
        }
      }
      return true;
    }

    //�񐔂�񋓂���
    public static ArrayList<Integer> findDivisors(int n){
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 1; i * i < n; i++) {
        if(n % i == 0){
          arr.add(i);
          //i*i�ȏ�̖񐔂͂����Ŕ��肷��
          if(n/i != i){
            arr.add(n/i);
          }
        }
      }

      //�����Ƀ\�[�g
      Collections.sort(arr);
      return arr;
    }

}