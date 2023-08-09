n = gets.chomp.to_i

pap = []
def output(str, pap)
    if str[0] == "make"
        line = []
        line << str[1]
        line << str[2]
        pap << line
    elsif str[0] == "getnum"
        puts pap[str[1].to_i - 1]
    elsif str[1] == "getname"
        puts pap[str[2].to_i - 1]
    end
end