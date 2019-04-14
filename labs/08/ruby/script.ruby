Script started on Sat 13 Apr 2019 11:04:41 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ruby$ cat name.rb 
# name.rb defines the Name class
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: April 13, 2019
####################################################

class Name

  def initialize(first, middle, last)
    @first, @middle, @last = first, middle, last
  end

  attr_reader :first, :middle, :last

  def fullName
    @first + " " + @middle + " " + @last
  end

  def print
    puts fullName
    fullName
  end
endqmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ruby$ script c        cat nameTester.rb 
# nameTester.rb tests class Name and its operations
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: April 13, 2019
####################################################

require './name.rb'
require 'test/unit/assertions'
include Test::Unit::Assertions

def testName
   name = Name.new("John", "Paul", "Jones")

   assert name.first == "John", 
           "first failed"
   assert name.middle == "Paul",
           "middle failed"
   assert name.last == "Jones",
           "last failed"
   assert name.fullName == "John Paul Jones",
           "fullName failed"
   assert name.print == "John Paul Jones",
           "print failed"
   
   print "All tests passed!\n"
end 

testNameqmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ruby$ ruby nameTester.rb 
John Paul Jones
All tests passed!
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ruby$ exit
exit

Script done on Sat 13 Apr 2019 11:05:07 PM EDT
