n, m, l = gets.split.map(&:to_i)
dmg = n.times.map { gets.split.map(&:to_i) }
prm = l.times.map { gets.split.map(&:to_i) }

(l - 1).times do |i|
  diff = m.times.map.with_index { |j| prm[i + 1][j] - prm[i][j] }

  order = -1
  n.times do |j|
    same = true
    m.times { |k| same = false if diff[k] != dmg[j][k] }

    order = j + 1 if same
  end
  puts order
end