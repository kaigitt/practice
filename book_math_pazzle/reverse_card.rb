N = 100
cards = Array.new(N, false)
p cards

(2..N).each{ |i|
  j = i - 1
  while (j < cards.size) do
    cards[j] = !cards[j]
    j += 1
  end
}

N.times do |i|
  puts i + 1 if !cards[i]
end