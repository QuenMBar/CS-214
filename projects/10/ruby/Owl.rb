# Owl.rb | Defines the Owl class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './FlyingBird.rb'

class Owl < FlyingBird

    def call
        'Whoo-hoo!'
    end

end