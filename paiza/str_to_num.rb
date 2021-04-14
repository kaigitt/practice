line1, line2 = gets.chomp.split(" ")
line1 = line1.split("")
line2 = line2.split("")

def str_to_num(str)
    if str == "A"
      return 0
    elsif str == "B"
      return 1
    elsif str == "C"
      return 2
    elsif str == "D"
      return 3
    elsif str == "E"
      return 4
    end
end

def num_to_10(num, index, line)
    d = (line.size - index) - 1
    return num * ( 5 ** d )
end
# 5進数に変換
line1.each.with_index do |l, i|
    line1[i] = str_to_num(l)
end
line2.each.with_index do |l, i|
    line2[i] = str_to_num(l)
end
# １０進数に変換
line1.each.with_index do |l, i|
    line1[i] = num_to_10(l, i, line1)
end
line2.each.with_index do |l, i|
    line2[i] = num_to_10(l, i, line2)
end


# line1と2の数値化
sub_total = 0
sub_total = line1.sum + line2.sum
line = []
# ５進数に
  while sub_total != 0 do
    line << sub_total % 5
    sub_total = sub_total / 5
  end
  line.each.with_index do |l, i|
    if l ==0
        print "A"
    elsif l == 1
        print "B"
    elsif l == 2
        print "C"
    elsif l == 3
        print "D"
    elsif l == 4
        print "E"
    end
  end