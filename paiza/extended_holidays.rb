def max(a, b)
  a > b ? a : b
end

n, l = gets.split.map(&:to_i)
b = gets.split.map(&:to_i)

max_streak = 0

(0..n - 1).each do |i|
  (i..n - 1).each do |j|
    b_sub = b[i..j]

    break if b_sub.count(0) > l

    max_streak = max(max_streak, b_sub.length)
  end
end

puts max_streak