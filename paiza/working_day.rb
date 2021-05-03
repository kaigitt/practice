PUBLIC_HOLIDAYS = [
  [1, 1],
  [1, 14],
  [2, 11],
  [3, 21],
  [4, 29],
  [4, 30],
  [5, 1],
  [5, 2],
  [5, 3],
  [5, 4],
  [5, 5],
  [5, 6],
  [7, 15],
  [8, 11],
  [8, 12],
  [9, 16],
  [9, 23],
  [10, 14],
  [10, 22],
  [11, 3],
  [11, 4],
  [11, 23]
]

END_OF_MONTH = [
  [1, 31],
  [2, 28],
  [3, 31],
  [4, 30],
  [5, 31],
  [6, 30],
  [7, 31],
  [8, 31],
  [9, 30],
  [10, 31],
  [11, 30]
]

WEEK_DAYS = {
  'MON' => 0,
  'TUE' => 1,
  'WED' => 2,
  'THU' => 3,
  'FRI' => 4,
  'SAT' => 5,
  'SUN' => 6
}

def next_day(m, d, day_of_week)
  next_m, next_d =
    case [m, d]
    when [12, 31]
      [1, 1]
    when *END_OF_MONTH
      [m + 1, 1]
    else
      [m, d + 1]
    end
  [next_m, next_d, (day_of_week + 1) % 7]
end

month, day, week_day = gets.chomp.split

m = month.to_i
d = day.to_i
day_of_week = WEEK_DAYS[week_day]

begin
  m, d, day_of_week = next_day(m, d, day_of_week)
end while PUBLIC_HOLIDAYS.include?([m, d]) || day_of_week > 4

puts "#{m}月#{d}日"