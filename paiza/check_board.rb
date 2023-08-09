board = []
result = "D"
5.times { board.push(gets.chomp.split(""))}
4.each do |i|
  ○ = 0
  ☓ = 0
  board.each do |row|
    if row[i] == "0"
      o = o + 1
    elsif row[i] == 'X'
      x = x + 1
    end
  end

  if o == 5
    result = 'O'
    break
  elsif x == 5
    result = 'X'
    break
  end
end

puts result