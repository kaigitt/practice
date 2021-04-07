input = gets.chomp.split(" ").map(&:to_i)
line = []
input[0].times do
    line << gets.chomp.split(" ")
end
def changeName(num, name, line)
    @line = line
    num = num.to_i - 1
    @line[num][0] = name
end

input[1].times do
    i = gets.chomp.split(" ")
    changeName(i[0], i[1], line)
end

line.each do |line|
    puts line.join(" ")
end