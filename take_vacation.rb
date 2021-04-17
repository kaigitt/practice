n, off_count = gets.chomp.split(" ").map(&:to_i)
days = []
n.times do
    days << gets.chomp
end
max = []
n.times do |i|
    days.push(days.shift) if i != 0
    un_days = days
    un_days.each.with_index do |day, j|
        if day == "work" && off_count > 0
            days[j] = "off" 
            off_count -= 1
        end
    end
    total = 0
    un_days.each.with_index do |day, i|
        if day == un_days[i + 1] && day == "off"
            total += 1
        end
    end
    max << total
end
p max.max + 1