def is_leap?(y)
  (y % 400).zero? || (y % 100).nonzero? && (y % 4).zero?
end

y, m = gets.split.map(&:to_i)

puts case m
     when 2
       is_leap?(y) ? 29 : 28
     when 4, 6, 9, 11
       30
     else
       31
     end