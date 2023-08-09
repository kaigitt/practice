import java.util.*;

public class FindingMissingCard {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //スペードが'S'、ハートが'H'、クラブが'C'、ダイヤが'D'で表されています

    //トランプのすべてのカードの配列を作成
    String[][] AllCards = new String[4][14];
    String[] suits = {"S", "H", "C", "D"};
    for (int i = 0; i < suits.length ; i++) {
      for (int j = 1; j < 14; j++) {
        AllCards[i][0] = suits[i];
        AllCards[i][j] = Integer.toString(j);
      }
    }
    
    //太郎が持っているカードの配列を作成
    String suit = "";
    String num = "";
    String[][] tarouCards = new String[n][2];
    for (int i = 0; i < n; i++) {
      suit = sc.next();
      num = sc.next();
      tarouCards[i][0] = suit;
      tarouCards[i][1] = num;
      //System.out.println(tarouCards[i][0] + " " + tarouCards[i][1]);
    }

    //すべてのカードを一枚ずつ、太郎が持っているカードと一致するか確認
    for (int i = 0; i < suits.length ; i++) {
      for (int j = 1; j < 14; j++) {
        boolean findFlag = false;
        //System.out.println(AllCards[i][0] + " " + AllCards[i][j]);
        for (int k = 0; k < tarouCards.length; k++) {
          if(tarouCards[k][0].equals(AllCards[i][0]) && tarouCards[k][1].equals(AllCards[i][j])){
            findFlag = true;
            break;
          }
        }
        if(findFlag == false){
          System.out.println(AllCards[i][0] + " " + AllCards[i][j]);
        }
      }
    }
  }
}
