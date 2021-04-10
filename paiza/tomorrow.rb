def next_day(y, m, d)
  case [m, d]
  when [12, 31]
    [y + 1, 1, 1]
  when [2, 28]
    is_leap?(y) ? [y, 2, 29] : [y, 3, 1]
  when *END_OF_MONTH
    [y, m + 1, 1]
  else
    [y, m, d + 1]
  end
end

y, m, d = gets.split.map(&:to_i)

puts '%d %d %d' % next_day(y, m, d)