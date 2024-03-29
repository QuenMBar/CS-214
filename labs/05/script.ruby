Script started on Sat 02 Mar 2019 03:46:26 PM EST
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ cat split.rb 
# split.rb splits a string into two substrings.
#
# Input: A string and an integer string position to split the string by.
# Precondition: The position integer is within the range of the string size.
# Output: The substrings aString(0, position - 1) and
#   aString(pos, length() - 1).
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes on March 2, 2019
#################################################################


# split() splits a string into its two substrings.
# Receive: aString, the string to be split,       
#        pos, the split position.                  
# PRE: 0 <= pos < the length of aString.
# Return: the substring of aString before pos, and  
#         the substring of aString from pos onwards.
######################################################

def split(aString, pos)
  splitString =  Array[aString[0, pos], aString[pos, aString.size]]
end


def main
  print "To split a string, enter the string: "; 
  the_string = gets
  print "Enter the split position: "; 
  position = gets.to_i
  split_string = split(the_string, position)
  puts "The first part is: " << split_string[0]
  puts "and the second part is: " << split_string[1]
end

main
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ rubb y split.rb
To split a string, enter the string: Hello
Enter the split position: 0
The first part is: 
and the second part is: Hello
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ ruby split.rb
To split a string, enter the string: Hello
Enter the split position: 3
The first part is: Hel
and the second part is: lo
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ ruby split.rb
To split a string, enter the string: Hello
Enter the split position: 5
The first part is: Hello
and the second part is: 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ exit

Script done on Sat 02 Mar 2019 03:46:58 PM EST
