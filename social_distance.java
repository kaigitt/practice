#include <iostream>
#include <vector>
using namespace std;

struct Edge {
    int to, rev;
    bool isvalid;
};

class Maximum_Matching {
public:
    vector<Edge> G[5009];
    bool used[5009];

    // グラフに辺を追加する
    void add_edge(int u, int v) {
        G[u].push_back(Edge{ v, (int)G[v].size(), true });
        G[v].push_back(Edge{ u, (int)G[u].size() - 1, false });
    }

    // 増加道を見つける
    bool dfs(int pos, int to) {
        if (pos == to) return true;
        used[pos] = true;
        for (int i = 0; i < G[pos].size(); i++) {
            if (used[G[pos][i].to] == true) continue;
            if (G[pos][i].isvalid == false) continue;
            bool ret = dfs(G[pos][i].to, to);
            if (ret == true) {
                G[pos][i].isvalid = false;
                G[G[pos][i].to][G[pos][i].rev].isvalid = true;
                return true;
            }
        }
        return false;
    }

    // 最大マッチングを求める
    int getans(int u, int v) {
        int cnt = 0;
        while (true) {
            for (int i = 0; i < 5009; i++) used[i] = false;
            bool zouka_path = dfs(u, v);
            if (zouka_path == false) break;
            cnt++;
        }
        return cnt;
    }
};