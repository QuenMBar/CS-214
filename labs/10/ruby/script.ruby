Script started on Tue 07 May 2019 08:48:24 PM EDT
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/ruby$ cat Birds.rb 
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

puts "\nWelcome to the Bird Park!\n\n"

bird0 = Bird.new "Hawkeye"
bird0.print

bird1 = Duck.new "Donald"
bird1.print

bird2 = Goose.new "Mother"
bird2.print

bird3 = Owl.new "Woodsey"
bird3.print

puts "\n\n"qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/ruby$ catB  Br ird.rb 
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

  def className
    self.class.to_s
  end

  def print
    puts name + " " + className + " says " + call
  end
  
end
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/ruby$ cat Duck.rb 
# Duck.rb | Defines the Duck class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './Bird.rb'

class Duck < Bird

    def call
        'Quack!'
    end

endqmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/ruby$ cat Goose.rb 
# Goose.rb | Defines the Goose class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './Bird.rb'

class Goose < Bird

    def call
        'Honk!'
    end

endqmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/ruby$ cat Owl.rb 
# Owl.rb | Defines the Owl class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: Quentin Barnes
# Date: May 07, 2019
####################################################

require './Bird.rb'

class Owl < Bird

    def call
        'Whoo-hoo!'
    end

endqmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/ruby$ ruby Birds.rb

Welcome to the Bird Park!

Hawkeye Bird says Squaaaaaaawk!
Donald Duck says Quack!
Mother Goose says Honk!
Woodsey Owl says Whoo-hoo!


qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/ruby$ exit

Script done on Tue 07 May 2019 08:49:10 PM EDT
