#! /usr/bin/ruby
# circle_area.rb computes the area of a circle given its radius
#
# Input: the radius of a circle
# Precondition: the radius is not negative
# Output: the area of the circle.
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by:
# Date:
###############################################################

# function circleArea returns a circle's area, given its radius
# Parameters: r, a number
# Precondition: r > 0.
# Returns: the area of a circle whose radius is r.
PI = 3.1415927
def circleArea(r)
  PI * r ** 2
end

if __FILE__ == $0
  puts "To compute the area of a circle,"
  print " enter its radius: "
  radius = gets.chomp.to_f
  print "The circle's area is: "
  puts circleArea(radius)
end