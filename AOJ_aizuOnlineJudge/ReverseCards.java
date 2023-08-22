import java.util.*;

public class ReverseCards {
    public static void main(String[] args) {
      boolean[] cards = new boolean[100];
      for (int j = 0; j < 100; j++) {
        cards[j] = false; 
      }
      for (int j = 0; j < 100; j++) {
        reverseCards(cards, j);
        for (int j = 0; j < 100; j++) {
        System.out.println(cards[j]);
      }

      }
      

      int num = 0;
      for(boolean b: cards){
        if(!b){
          //System.out.println(num);
        }
        num++;
      }

    }
    
    public static boolean[] reverseCards(boolean[] cards, int n){
      for (int i = n; i < 100; i+=2) {
        if(cards[i]){
          cards[i] = false;
        } else if(cards[i] == false) {
          cards[i] = true;
        }
      }
      return cards;
    }
}