def is_leap?(y)
  (y % 400).zero? || (y% 100).nonzero? && (y % 4).zero?
end

y = gets.to_i
puts is_leap?(y) ? 'yes' : 'no'