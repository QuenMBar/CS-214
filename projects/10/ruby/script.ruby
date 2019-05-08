Script started on Wed 08 May 2019 04:58:25 PM EDT
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat Birds.rb 
# birds.rb | Tests out the menagerie of bird classes.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
######################################################

require './Bird.rb'
require './Duck.rb'
require './Goose.rb'
require './Owl.rb'
require './Ostrich.rb'
require './Penguin.rb'
require './Kiwi.rb'

puts "\nWelcome to the Bird Park!\n\n"

bird0 = Bird.new "Hawkeye"
bird0.print

bird1 = Duck.new "Donald"
bird1.print

bird2 = Goose.new "Mother"
bird2.print

bird3 = Owl.new "Woodsey"
bird3.print

bird4 = Ostrich.new "Orville"
bird4.print

bird5 = Penguin.new "Peter"
bird5.print

bird6 = Kiwi.new "Kevin"
bird6.print

puts "\n\n"qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ car t Bird/ ,.  .rb 
# Bird.rb | Defines a Bird superclass 
#   to be extended by specific bird sub-classes.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

class Bird

  attr_reader :name

  def initialize(name)
    @name = name
  end

  def call
    'Squaaaaaaawk!'
  end

  def movement
    'came by'
  end

  def className
    self.class.to_s
  end

  def print
    puts name + " " + className + " just " + movement + " and said " + call
  end
  
end
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat FlyingBird.rbb 
# FlyingBird.rb | Defines the FlyingBird class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './Bird.rb'

class FlyingBird < Bird

    def movement
        'flew past'
    end

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat Duck.rb 
# Duck.rb | Defines the Duck class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './FlyingBird.rb'

class Duck < FlyingBird

    def call
        'Quack!'
    end

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat Goose.rb 
# Goose.rb | Defines the Goose class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './FlyingBird.rb'

class Goose < FlyingBird

    def call
        'Honk!'
    end

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat Owl.rb 
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

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat w WalkingBird.rrb 
# WalkingBird.rb | Defines the WalkingBird class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './Bird.rb'

class WalkingBird < Bird

    def movement
        'walked past'
    end

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat Ostrich.rb 
# Ostrich.rb | Defines the Ostrich class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './WalkingBird.rb'

class Ostrich < WalkingBird

    def call
        'Snork!'
    end

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat Penguin.rb 
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

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ cat Kiwi.rb 
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

endqmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ ruby Birds.rb 

Welcome to the Bird Park!

Hawkeye Bird just came by and said Squaaaaaaawk!
Donald Duck just flew past and said Quack!
Mother Goose just flew past and said Honk!
Woodsey Owl just flew past and said Whoo-hoo!
Orville Ostrich just walked past and said Snork!
Peter Penguin just walked past and said Huh-huh-huh-huuuuh!
Kevin Kiwi just walked past and said Screech!


qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ruby$ exit

Script done on Wed 08 May 2019 04:59:26 PM EDT
