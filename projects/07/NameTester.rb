# NameTester.rb tests class Name and its operations
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quenin Barnes
# Date: April 18, 2019
####################################################

require 'test/unit/assertions'   # needed for assert
include Test::Unit::Assertions

class Name

    def initialize(first, middle, last)
        @first, @middle, @last = first, middle, last
    end

    #Allows user to modify variables
    attr_reader :first, :middle, :last
    attr_writer :first, :middle, :last

    def fullName
        @first + " " + @middle + " " + @last
    end

    def print
        puts self.fullName
        self.fullName
    end

    #Returns the name in a specific format 
    def lfmi
        @last + ", " + @first + " " + @middle[0,1] + "."
    end

    #Sets name based on user Inputs
    def read
        @first = gets
        @middle = gets
        @last = gets
        @first.delete!("\n") # Removes newline characters from the name
        @middle.delete!("\n")
        @last.delete!("\n")
    end

end

def testName
    name = Name.new("John", "Paul", "Jones")

    assert name.first == "John", "first failed"
    assert name.middle == "Paul", "middle failed"
    assert name.last == "Jones", "last failed"
    assert name.fullName == "John Paul Jones", "fullName failed"
    assert name.print == "John Paul Jones", "print failed"

    name.first = "Marwan"
    name.middle = "Peter"
    name.last = "Pierce"
    assert name.fullName == "Marwan Peter Pierce", "fullName failed"
    assert name.lfmi == "Pierce, Marwan P.", "lfmi failed"

    name.read     # User Input Is Printed to verify correctness

    name.print
   
   print "All tests passed!\n"
end

testName

