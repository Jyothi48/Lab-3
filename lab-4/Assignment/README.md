#  Book Stack Simulation - Java

This is a simple Java program that simulates a Stack data structure to help a local library track recently returned books using their book IDs.

##  Features

This program provides the following features via overloaded constructors and overloaded methods

#  Constructors:
1. BookStack(int[] bookIds) 
   - Initializes the stack directly with a predefined array of book IDs.
2. BookStack(int maxSize) 
   - Initializes an empty stack with the specified maximum size.


# Push Operations (Overloaded):
- `push(int x)` → Push a single book ID.
- `push(int x, int y)` → Push two book IDs at once.



# Pop Operations (Overloaded):
- `pop()` → Pop one book ID from the stack.
- `pop(int n)` → Pop `n` book IDs from the stack at once.



# Display Operations (Overloaded):
- `display()` → Show all elements in the stack.
- `display(int n)` → Show the top `n` elements only.



