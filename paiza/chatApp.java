import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<String>> members = new ArrayList<>();
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

        for (int i = 0; i < m; i++) {
          ArrayList<String> member = new ArrayList<>();
          members.add(member);
        }


        if(g > 0){
          for (int i = 0; i < g; i++){
            int tmp = sc.nextInt();
            ArrayList<Integer> group = new ArrayList<>();
            for (int j = 0; j < tmp; j++) {
              group.add(sc.nextInt());
            }
            groups.add(group);
            
          }
        }
        

        for (int i = 0; i < m; i++){
          int from = sc.nextInt()-1;
          int privateOrGroup = sc.nextInt();
          int to = sc.nextInt()-1;
          String message = sc.next();
          if(privateOrGroup == 0){
            ArrayList<String> memberF = members.get(from);
            ArrayList<String> memberT = members.get(to);
            memberF.add(message);
            memberT.add(message);
          } else if(privateOrGroup == 1){
            ArrayList<Integer> groupT = groups.get(to);
            for (Integer z : groupT) {
              ArrayList<String> memberT = members.get(z-1);
              memberT.add(message);
            }
          }
        }

        for (int i = 0; i < members.size(); i++) {

          for (int j = 0; j < members.get(i).size(); j++) {
            System.out.println(members.get(i).get(j));
          } 
          if(i != members.size()-1){
            System.out.println("--");
          }
        }
    }
}