n = gets.chomp.to_i

def user(name)
    puts "#{name}"
end
line = []
n.times do
    line << gets.chomp.split(" ")
end
line.sort! { |a, b| b[1] <=> a[1] }
line.each do |line|
    puts line.join(" ")
end