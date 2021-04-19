num = gets.chomp.to_i
array = {}

(1..num).each do
  values = gets.split(' ')
  string = values[0]
  points = values[1].to_i
  if array[string]
    current = array[string]
    array[string] = current + points
  else
    array[string] = points
  end
end