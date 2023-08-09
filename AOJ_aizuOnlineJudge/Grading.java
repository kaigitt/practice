import java.util.*;

public class Grading {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //テストの点数は、中間試験の点数 m、期末試験の点数 f、再試験の点数 r で構成されています。

        int mediumScore = 0;
        int finalScore = 0;
        int retryScore = 0;
        while(sc.hasNextInt()){
          mediumScore = sc.nextInt();
          finalScore = sc.nextInt();
          retryScore = sc.nextInt();
          int mediumAndFinal = mediumScore + finalScore;
          if(mediumScore == -1 && finalScore == -1 && retryScore == -1){ break; }

          //中間試験、期末試験のいずれかを欠席した場合成績は F。
          if(mediumScore == -1 || finalScore == -1){
            System.out.println("F");
            continue;
          }
          //中間試験と期末試験の合計点数が 80 以上ならば成績は A 。
          if(80 <= mediumAndFinal){
            System.out.println("A");
            continue;
          }
          //中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。
          if(65 <= mediumAndFinal && mediumAndFinal < 80){
            System.out.println("B");
            continue;
          }
          //中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
          if(50 <= mediumAndFinal && mediumAndFinal < 65){
            System.out.println("C");
            continue;
          }
          //中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は C。
          if(30 <= mediumAndFinal && mediumAndFinal < 50){
            if(50 <= retryScore){
              System.out.println("C");
            } else {
              System.out.println("D");
            }
            continue;
          }
          //中間試験と期末試験の合計点数が 30 未満ならば成績は F
          if(mediumAndFinal < 30){
            System.out.println("F");
            continue;
          }
        }
    }
}
