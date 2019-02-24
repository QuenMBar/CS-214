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

