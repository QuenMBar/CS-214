Script started on Tue 05 Mar 2019 08:51:54 PM EST
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ cat quadraticRoots.rb 
# QuadraticRoots.rb is a program for finding the roots of a quadratic 
# function y = ax^2 + bx + c where a, b, c are given by the user.
#
# Input: a, b, c as doubles.
# Output: the roots of y = ax^2 + bx + c with the users variables.
#
# Written by: Quentin Barnes on March 5, 2019
#################################################################


# quadraticRoots() finds the roots of a quadratic 
# function y = ax^2 + bx + c
# Receive: a, b, c as doubles                  
# Return: roots 1 and 2 of the function
######################################################

def quadraticRoots(a, b, c)
  if a != 0 then
    arg = b**2 - 4 * a * c
    if arg >= 0 then
      quadRoots =  Array[(-b + Math.sqrt(arg)) / (2 * a), (-b - Math.sqrt(arg)) / (2 * a)]
    else
      puts "*** quadraticRoots(): b^2 - 4ac is negative!"
      quadRoots =  Array[0.0, 0.0]
    end
  else
    puts "*** QuadraticRoots(): a is zero!"
    quadRoots =  Array[0.0, 0.0]
  end
end


def main
  print "\nTo compute the roots of a quadratic equation given\nan equasion of the form: y = ax^2 + bx + c \nEnter a: "
  aIn = gets.to_f
  print "Enter b: "
  bIn = gets.to_f
  print "Enter c: "
  cIn = gets.to_f
  quad_roots = quadraticRoots(aIn, bIn, cIn)
  print "The first part is: "
  puts quad_roots[0]
  print "and the second part is: "
  puts quad_roots[1]
end

main
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 3
Enter b: 12
Enter c: 8
The first part is: -0.8452994616207485
and the second part is: -3.154700538379251
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 0
Enter b: 8
Enter c: 9
*** QuadraticRoots(): a is zero!
The first part is: 0.0
and the second part is: 0.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 5
Enter b: 1
Enter c: 5
*** quadraticRoots(): b^2 - 4ac is negative!
The first part is: 0.0
and the second part is: 0.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 2
Enter b: 8
Enter c: 6
The first part is: -1.0
and the second part is: -3.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ exit

Script done on Tue 05 Mar 2019 08:52:48 PM EST
