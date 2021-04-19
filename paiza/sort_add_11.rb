array = %w[HND NRT KIX NGO NGO]

is_duplicate = false

array.size.times do |i|
  array.size.times do |j|
    is_duplicate = true if i != j and array[i] == array[j]
  end
end

puts is_duplicate