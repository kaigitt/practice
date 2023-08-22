import java.util.*;

/**
 * 10進数、2進数、8進数のいずれで表現しても回文数となる数値のうち、10進数で10以上で最小の値を求めてください
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
