n = gets.to_i
line = []
n.times do
  line << gets.chomp.split(" ").map(&:to_i)
end
max = 0
min = line[0][3]
line.each do |l|
    if l[2].to_i > max
        max = l[2]
    end
    if l[3].to_i <= min
        min = l[3]
    end
end
puts "#{line[0][0].to_i} #{line[n-1][1].to_i} #{max} #{min}"
