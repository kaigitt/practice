legs,total,crane,turtle = gets.chomp.split(' ').map(&:to_i)


crane_num = 0
total.times do |i|
    count = total
    legs_count = legs
    i += 1
    legs_count -= (crane * i)
    legs_count -= (turtle * (count - i))
    if legs_count == 0
        crane_num = i
    end
end
if crane_num > 0
    puts "#{crane_num} #{total - crane_num}"
else
    puts "miss"
end