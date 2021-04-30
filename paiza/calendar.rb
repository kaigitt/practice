def is_leap?(y)
  (y % 400).zero? || (y % 100).nonzero? && (y % 4).zero?
end

y, m = gets.split.map(&:to_i)

cal =
  case m
  when 2
    is_leap?(y) ? [*1..29] : [*1..28]
  when 4, 6, 9, 11
    [*1..30]
  else
    [*1..31]
  end

m, y = m + 12, y - 1 if m < 3

week_day = (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + 1) % 7

week_day.times { cal.unshift ' ' }

cal.push ' ' until cal.length == 42

cal.each_slice(7) { |line| puts '%2s %2s %2s %2s %2s %2s %2s' % line }