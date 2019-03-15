Script started on Thu 14 Mar 2019 08:19:56 PM EDT
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ cat arrayProcessing.rb 
#  arrayProcessing.rb allows the user to enter an array and print the entered array

#  Student Name: Quentin Barnes
#  Date: 3/14/19

#  Recive: the values of an array
#  Output: the entered array
########################################################

###############################################
# readArray() is a function that lets the user enter values into an array
# Recives: An array
################################################

def readArray(anArray)
   for i in 0..anArray.size-1
      anArray[i] = gets.to_f
   end
end

###################################
# printArray() is a function that prints an array that it is given based on the
# size it is given 
# Recives: An array
####################################

def printArray(anArray)
  anArray.each{|val| puts val}
end

def main

  puts "\nEnter the size of the array: \n"
  theSize = gets.to_i

  theArray = Array.new(theSize)
  puts "Enter values: "
  readArray(theArray)

  puts "Enter the array entered is: "

  printArray(theArray)
end

main

qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ ruby arrayProcessing.rb 

Enter the size of the array: 
6
Enter values: 
3.52
4.6
7
0.1
4.1
2
Enter the array entered is: 
3.52
4.6
7.0
0.1
4.1
2.0
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ exit

Script done on Thu 14 Mar 2019 08:20:36 PM EDT
