# Penguin.rb | Defines the Penguin class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './WalkingBird.rb'

class Penguin < WalkingBird

    def call
        'Huh-huh-huh-huuuuh!'
    end

end