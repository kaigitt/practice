using namespace std;

long long fibo(int n, vector<long long>, &memo) {

  //ベースケース
  if (n == 0) return 0;
  else if (n == 1) return 1;

  if (memo[n] != -1) return memo[n];

  return memo[n] = fibo(n-1, memo) + fibo(n-2, memo);
}

int main(){
  vector<long long> memo(50, -1);
  for(int n = 0; n < 50; n++){
    count << n << "項目の値:" << fibo(n, memo) << endl;
  }
}


