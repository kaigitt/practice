y, m, d = gets.split.map(&:to_i)

date_number = y * 10_000 + m * 100 + d

era =
  case date_number
  when 1873_01_01..1912_07_29
    '明治'
  when 1912_07_30..1926_12_24
    '大正'
  when 1926_12_25..1989_01_07
    '昭和'
  when 1989_01_08..2019_04_30
    '平成'
  when 2019_05_01..3000_12_31
    '令和'
  end

puts "#{era}年#{m}月#{d}日"