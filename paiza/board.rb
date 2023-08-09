input_line = gets.chomp.split(" ").map(&:to_i)
h = input_line[0]
w = input_line[1]
lines = []
h.times do
    lines << gets.chomp.split("")
end
h_coo = []
w_coo = []
h.times do |i|
    w.times do |z|
        # 3つのパターン
        if z == 0 && lines[i][z + 1] == "#"
            # 左端で右が＃
          h_coo << [ i , z ]
        elsif z == (w - 1) && lines[i][z - 1] == "#"
            # 右端で左が＃
          h_coo << [ i , z ]
        elsif lines[i][z - 1] == "#" && lines[i][z + 1] == "#"
            # 両横が＃
          h_coo << [ i , z ]
        end
    end
    w.times do |z|
      # 3つのパターン
      if i == 0 && lines[i + 1][z] == "#"
        w_coo << [ i , z ]
      elsif i == (h - 1) && lines[i - 1][z] == "#"
        w_coo << [ i , z ]
      elsif lines[i - 1][z] == "#" && lines[i + 1][z] == "#"
        w_coo << [ i , z ]
      end
    #   puts "#{coo[0]} #{coo[1]}" unless coo == 0
    end
end
for i in h_coo
  if w_coo.include?(i)
      puts "#{i[0]} #{i[1]}"
  end
end