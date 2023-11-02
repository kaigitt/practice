import math
# coding: utf-8
# 自分の得意な言語で
# Let's チャレンジ！！
m,n = map(int, input().split())

foods = []
for i in range(m):
    foods.append(int(input()))

for i in range(n):
    total = 0
    food_list = list(map(int, input().split()))
    for j,food in enumerate(foods):
        total += food * food_list[j] // 100
    print(total)