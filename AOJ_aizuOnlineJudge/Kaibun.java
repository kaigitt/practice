import java.util.*;

/**
 * 10�i���A2�i���A8�i���̂�����ŕ\�����Ă��񕶐��ƂȂ鐔�l�̂����A10�i����10�ȏ�ōŏ��̒l�����߂Ă�������
 */
public class Kaibun {
    public static void main(String[] args) {
      int num = 10;
      boolean loopFlag = true;
      while(loopFlag){
        String numt = String.valueOf(num);
        String numBin = String.valueOf(Integer.toBinaryString(num));
        String numOct = String.valueOf(Integer.toOctalString(num));
        StringBuilder numSb = new StringBuilder(numt);
        StringBuilder numBinSb = new StringBuilder(numBin);
        StringBuilder numOctSb = new StringBuilder(numOct);
        if(numt.contentEquals(numSb.reverse()) &&
           numBin.contentEquals(numBinSb.reverse()) &&
           numOct.contentEquals(numOctSb.reverse())){
            loopFlag = false;
            break;
           }
        num++;
      }
      System.out.println(num);
    }
  
}
