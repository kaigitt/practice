import java.util.*;

public class CutBar {
    public static void main(String[] args) {
      System.out.println(cutBar(3, 8, 1));
    }

    public static int cutBar(int m , int n, int current){
      //�{���������Ɠ����ɂȂ�����I��
      if(current >= n){
        return 0;
      } else if(current < m){
        //�؂�l�̐����{�������Ȃ���΁A�ł������؂邱�Ƃ��ł��邩��A�{������{�ɂȂ�
        return 1 + cutBar(m, n, current * 2);
      } else {
        return 1 + cutBar(m, n, current + m);
      }
    }
}
