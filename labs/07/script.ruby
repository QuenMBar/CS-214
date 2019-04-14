Script started on Sat 13 Apr 2019 09:35:07 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ car t NameTester.rb
# NameTester.rb tests class Name and its operations
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quenin Barnes
# Date: April 13, 2019
####################################################

require 'test/unit/assertions'   # needed for assert
include Test::Unit::Assertions

class Name

    def initialize(first, middle, last)
        @first, @middle, @last = first, middle, last
    end

    attr_reader :first, :middle, :last

    def fullName
        @first + " " + @middle + " " + @last
    end

    def print
        puts self.fullName
        self.fullName
    end

end

def testName
  name = Name.new("John", "Paul", "Jones")

  assert name.first == "John", "first failed"
  assert name.middle == "Paul", "middle failed"
  assert name.last == "Jones", "last failed"
  assert name.fullName == "John Paul Jones", "fullName failed"
  assert name.print == "John Paul Jones", "print failed"
   
   print "All tests passed!\n"
end

testName

qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ runy    by NameTester.rb
John Paul Jones
All tests passed!
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ exit
exit

Script done on Sat 13 Apr 2019 09:35:31 PM EDT
