Script started on Sat 23 Feb 2019 05:42:42 PM EST
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ cat letter_grade.rb
#! /usr/bin/ruby
# letter_grades.rb converts a grade average to its coresponding letter grade
# Begun by: Dr. Nelesen, for CS 214 at Calvin College 
# Completed and Edited by by: Quentin Barnes
# Date: Feb 23, 2019
################################################################

# Input:  average, a int
# Precondition: average is <= 100 and >= 0
# Output: A letter grade A, B, C, D, or F

def letterGrade(average) 
    case average/10
    when 10 then
        puts "A"
    when 9 then
        puts "A"
    when 8 then
        puts "B"
    when 7 then
        puts "C"
    when 6 then
        puts "D"
    else
        puts "F"
    end

end


if __FILE__ == $0
   print "Enter your average grade: "
   average = gets
   print "Letter grade is: "
   puts letterGrade(average.to_i)
end

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ruby letter_grade.rb
Enter your average grade: 100
Letter grade is: A

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ruby letter_grade.rb
Enter your average grade: 95
Letter grade is: A

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ruby letter_grade.rb
Enter your average grade: 81
Letter grade is: B

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ruby letter_grade.rb
Enter your average grade: 79
Letter grade is: C

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ruby letter_grade.rb
Enter your average grade: 60
Letter grade is: D

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ruby letter_grade.rb
Enter your average grade: 24
Letter grade is: F

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ exit

Script done on Sat 23 Feb 2019 05:43:34 PM EST
