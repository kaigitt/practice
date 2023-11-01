# coding: utf-8
# 自分の得意な言語で
# Let's チャレンジ！！
a,b,n = map(int, input().split())

total_cost = a * 2 # 移動費をあらかじめ計算しておく
_, pre_last_day = map(int, input().split())

for i in range(n-1):
    stayed = 0
    start_day, last_day = map(int, input().split())
    stayed = start_day - pre_last_day
    
    # 宿泊費 と 移動費のどちらが安いか調べる
    if(stayed * b < a * 2):
        # 宿泊費の方が安い場合
        total_cost += stayed * b
    else:
        # 移動費の方が安い場合
        total_cost += a * 2
    pre_last_day = last_day
    

print(total_cost)
        
        
        