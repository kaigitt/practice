import math

N = int(input())

count = 0

def is_prime_n(n):
    if(n == 1): return False
    for i in range(2, n):
        if(n % i == 0):
            return False
    return True

nums = list(map(int,input().split()))

for i in nums:
    if(is_prime_n(i)):
        count += 1

print(count)