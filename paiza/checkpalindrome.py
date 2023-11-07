# palindrome 回文

L, R = map(int, input().split())

def checkpalindrome(n):
    str_n = str(n)
    str_n_reversed = str_n[::-1]
    if(str_n == str_n_reversed):
        return True
    else:
        return False


res = 0
for i in range(L, R+1):
    if(checkpalindrome(i)):
        res += 1

print(res)