if num < 500primeNumbers = []
(1..1000).each do |i|
  next if i == 1

  if i == 2
    primeNumbers.push(i)
    next
  end

  judge = true
  primeNumbers.each do |number|
      if i % number == 0
        judge = false
        break
      end
  end

  primeNumbers.push(i) if judge

end
puts primeNumbers