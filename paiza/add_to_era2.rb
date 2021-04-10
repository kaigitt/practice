y, m, d = gets.split.map(&:to_i)

date_number = y * 10_000 + m * 100 + d

era, yy =
  case date_number
  when 1873_01_01..1912_07_29
    ['明治', y - 1868 + 1]
  when 1912_07_30..1926_12_24
    ['大正', y - 1912 + 1]
  when 1926_12_25..1989_01_07
    ['昭和', y - 1926 + 1]
  when 1989_01_08..2019_04_30
    ['平成', y - 1989 + 1]
  when 2019_05_01..3000_12_31
    ['令和', y - 2019 + 1]
  end

era += yy == 1 ? '元' : yy.to_s

puts "#{era}年#{m}月#{d}日"