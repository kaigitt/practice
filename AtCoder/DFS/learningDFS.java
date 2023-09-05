import java.util.*;
public class Main {
  static List<List<Integer>> G;
  static List<Boolean> seen;

  static void dfs(int v){
    seen.set(v, true);

    // vから行ける各頂点next_vについて
    for(int next_v : G.get(v)){
      // next_vが探索済みだったらスルー
      if(seen.get(next_v)) continue;
      def(next_v); //再帰的に探索
    }
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        //入力値の受け取りとグラフの作成
        G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
          G.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
          int a = sc.nextInt();
          int b = sc.nextInt();
          G.get(a).add(b);
          G.get(b).add(a);
        }

        seen = new ArrayList<>();
        for (int i = 0; i < N; i++) {
          seen.add(false);
        }
        dfs(0);
        
    }
}