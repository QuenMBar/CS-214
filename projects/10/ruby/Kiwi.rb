# Kiwi.rb | Defines the Kiwi class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './WalkingBird.rb'

class Kiwi < WalkingBird

    def call
        'Screech!'
    end

end