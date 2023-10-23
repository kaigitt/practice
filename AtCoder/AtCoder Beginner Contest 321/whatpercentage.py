poll_info = [90, 60, 240, 30, 180]

# ここに poll_info を加工するコードを書いてください


total = sum(poll_info)

for i in range(len(poll_info)):
    poll_info[i] = poll_info[i]*100 // total

print(poll_info)