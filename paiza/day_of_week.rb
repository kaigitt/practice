DAYS_OF_WEEK = %w[日曜日 月曜日 火曜日 水曜日 木曜日 金曜日 土曜日]

def is_leap?(y)
  (y % 400).zero? || (y % 100).nonzero? && (y % 4).zero?
end

adjust_by_month = [0, 1, -1, 0, 0, 1, 1, 2, 3, 3, 4, 4]

y, m, d = gets.split.map(&:to_i)

leap_years = (y / 4 - y / 100 + y / 400)

days = 365 * y + leap_years
days += (m - 1) * 30 + d - 1 + adjust_by_month[m - 1]
days -= 1 if is_leap?(y) && m < 3

puts DAYS_OF_WEEK[days % 7]