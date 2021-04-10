user = gets.chomp
users = {}
fortunes = {}

(1..gets.chomp.to_i).each do
  tmp = gets.chomp.split(' ')
  users[tmp[0]] = tmp[1]
end

(1..gets.chomp.to_i).each do
  tmp = gets.chomp.split(' ')
  fortunes[tmp[0]] = tmp[1]
end

puts fortunes[users[user]]