#! /usr/bin/ruby
# year_codes.rb translates an academic year into a numeric code
# Begun by: Dr. Nelesen, for CS 214 at Calvin College 
# Completed by: Quentin Barnes
# Date: Feb 15, 2019
################################################################

# Input:  The name of an academic year
# Precondition: The academic year is a string with a value of freshman, 
#   sophomore, junior or senior
# Output: The corresponding integer code for the given academic year

def yearCode(year) 
    if year =~ /freshman/ then
        puts 1
    elsif year =~ /sophomore/ then
        puts 2
    elsif year =~ /junior/ then
        puts 3
    elsif year =~ /senior/ then
        puts 4
    else
        puts 0
    end

end


if __FILE__ == $0
   print "Enter the year: "
   year = gets
   print "Numeric code is: "
   puts yearCode(year)
end

