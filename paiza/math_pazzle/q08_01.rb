N = 12

def move(log)
  return 1 if log.size == N + 1
  cut = 0
  # 前後左右に移動
  [[0,1], [0, -1], [1,0], [-1, 0]].each do |d|
    next_pos = [log[-1][0] + d[0], log[-1][1] + d[1]]
    # 探索済みでなければ移動させる
    if !log.include?(next_pos) then
      cut += move(log + [next_pos])
    end
  end
  cut
end

puts move([[0,0]])