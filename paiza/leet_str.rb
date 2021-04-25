lines = gets.chomp.split("")
lines.each do |line|
    case line
    when "A"
      print 4
    when "E"
      print 3
    when "G"
       print 6
     when "I"
       print 1
     when "O"
       print 0
    when "S"
       print 5
    when"Z"
       print 2
   else
       print line
    end
end
# A	4
# E	3
# G	6
# I	1
# O	0
# S	5
# Z	2