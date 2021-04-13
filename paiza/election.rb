m,n,k = gets.chomp.split(" ").map(&:to_i)
person = []
m.times do
    person << 0
end
k.times do
    z = (gets.to_i) - 1
    # 有権者かつ未支持から
    if n >= 0
        n -= 1
        person[z] += 1
    end
    
    # 他の支持者から一人ずつ
    person.each.with_index do |pers, i|
        if i == z
        else
            if pers >= 1
               person[i] -= 1
               person[z] += 1
            end
        end
    end
end
 a = person.sort.last
person.each.with_index do |per, i|
  if a == per
      p i + 1
  end
end