n = gets.chomp.to_i

def user(name)
    puts "#{name}"
end
line = []
n.times do
    line << gets.chomp.split(" ")
end
age = gets.chomp.to_i
line.each do |line|
    user(line[0]) if line[1].to_i == age
end

