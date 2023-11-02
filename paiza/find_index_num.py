# 標準入力から値を受け取る
# S: str 型
S = input()

num_list = [
    "zero", "one", "two", "three", "four",
    "five", "six", "seven", "eight", "nine"
]

def find_list(s):
    if(s in num_list):
        return True
    else:
        return False

result = ""

for i in range(len(S)):
    tmp = S[i]
    for j in range(i+1, len(S)):
        tmp += S[j]
        if(find_list(tmp)):
            result += str(num_list.index(tmp))
            i += len(tmp)
            continue

print(result)