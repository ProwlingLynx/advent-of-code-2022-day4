# My Thoughts Scratch File.
## Goals
I want to improve my skills at creating solutions in a timely basis.

## thoughts on the problem at hand.
This feels like a fun problem to tackle. I have not dealt with intervals and feel this will be the challenge I need to
overcome this time.

I think reading the file using Scanner is still an ok solution.
This time I want to experiment with how I am instancing the objects. The problem I am facing is that it feels like my code 
is hard to change when the second part drops.

- What is the expected input data?
  - a list of unknown size. Each entry represents a pair of ranges.
- What are we doing with this data?
  - We must count the number of ranges that completely overlap with one another inclusively.
- How should I model this data?
  - I can have each range represented with an object, Elf. 
  - The Elf object can compare itself to another Elf and determine if the other Elf is within it's range
  - I recognize that I also included an expected behavior as well
- Should the elf object compare itself or is that a service being rendered?
  - I think the Elf object should have a method that solves the is it in range of the other elf.
  - So all the solution would need to do is call elf1 on elf2 and then reverse the order.
  - I think it should not use the compare method from comparable. This is to solve the problem only.
- I think I can get away with using a list of pairs that calls the isOverlapping method on each elf.

## Part two thoughts
Part two was not a bad experience to refactor. However, I did find myself having to add three additional methods to classes
I have already written and tested. I tried to implement inheritance to solve the issue by extending the elf class, but quickly realized that I did
not have getters to access the private fields. I also considered polymorphism, but again my code was too rigid to let me
do so reasonably.

Maybe I could have used polymorphism, but I did not want to add a useless parameter. I am going to have to consider 
having data classes with  getters and setters as a way to make the data class more accessible to inheritance and maybe
polymorphism.
