n = gets.to_i
fibo_array = [0, 1]
n.times do |i|
  i += 1
  fibo_array << (fibo_array[i - 1] + fibo_array[i])
end
p fibo_array