Script started on Sat 16 Feb 2019 05:24:11 PM EST
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ cat year_codes.rb
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

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ruby year_codes.rb
Enter the year: freshman
Numeric code is: 1

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ruby year_codes.rb
Enter the year: sophomore
Numeric code is: 2

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ruby year_codes.rb
Enter the year: junior
Numeric code is: 3

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ruby year_codes.rb
Enter the year: senior
Numeric code is: 4

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ruby year_codes.rb
Enter the year: sen
Numeric code is: 0

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ruby year_codes.rb
Enter the year: 1
Numeric code is: 0

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ exit

Script done on Sat 16 Feb 2019 05:25:43 PM EST
