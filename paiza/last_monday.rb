def is_leap?(y)
  (y % 400).zero? || (y % 100).nonzero? && (y % 4).zero?
end

x = gets.to_i

end_of_month = 400 * 12

count = [0, 0, 0, 0, 0, 0, 0]

(1..400).each do |y|
  (1..12).each do |m|
    d =
      case m
      when 2
        is_leap?(y) ? 29 : 28
      when 4, 6, 9, 11
        30
      else
        31
      end

    m, y = m + 12, y - 1 if m < 3

    week_num = (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + d) % 7

    count[week_num] += 1
  end
end

probability =
  if x == 5
    (count[0] + count[5] + count[6]).to_f / end_of_month
  else
    count[x].to_f / end_of_month
  end

puts '%.6f' % probability