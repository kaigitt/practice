  import java.util.*;
  public class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          int D = sc.nextInt();
          long P = sc.nextLong();

          long[] arr = new long[N];
          long[] prefixSum = new long[N];

          for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
          }

          Arrays.sort(arr);

          //�󂯎�����l�̔z��������Ƀ\�[�g����prefixSum�̗ېϘa�̔z����쐬����
          prefixSum[0] = arr[0];
          for (int i = 0; i < N-1; i++) {
            prefixSum[i+1] = prefixSum[i] + arr[i+1];
          }

          //���ׂĂ̓����ōw���ł�������group�Ƃ��Ċi�[
          //������猸�炵�Ă����l���ŁA
          //prefixSum[N - 1 - (i * D)]�F����`�P�b�g���w�����Ȃ��Ƃ���i�܂ł̍��v
          //(i * P)                   �F����`�P�b�g���w�������Ƃ���i�܂ł̍��v
          int group = (N + D - 1)/ D;
          long result = P * group;
          for (int i = 0; i < group; i++) {
            result = Math.min(result, prefixSum[N - 1 - (i * D)] + (i * P));
          }

          System.out.println(result);
      }
  }