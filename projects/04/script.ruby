Script started on Sat 23 Feb 2019 08:26:24 PM EST
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ cat nLoop.rb 
#! /usr/bin/ruby
# nLoop.rb computes the factorial of a given number.
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed and edited by: Quentin Barnes on Feb 23, 2019
#
# Input:  n, an int.
# Precondition: n >= 2.
# Output: The factorial of the inputed number

def nLoop(n) 
   answer = 1.0
   for i in 2..n 
      answer = answer * i

   end
   puts answer
end

if __FILE__ == $0
   print "To compute n!, enter n: "
   n = gets.to_i
   
   puts nLoop(n)
end

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ruby N nLoop.rb 
To compute n!, enter n: 5
120.0

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ruby nLoop.rb 
To compute n!, enter n: 8
40320.0

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ruby nLoop.rb 
To compute n!, enter n: 10
3628800.0

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ruby nLoop.rb 
To compute n!, enter n: 25
1.5511210043330986e+25

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ exit

Script done on Sat 23 Feb 2019 08:27:24 PM EST
