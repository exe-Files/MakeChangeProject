#MakeChangeProject

### Overview
This program simulates a cash register and provides change to customers
in the appropriate currency.



### Technologies Used
- Java
- Conditionals
- Looping
- Methods

### How to Run
This is a console java program, so all that is needed is Java installed on your system, and a familiarity with console commands
- Open the console
- Run Javac MakeChange.java
  - this will compile your code into a runnable class file
- Run Java MakeChange.class
- Input the total amount of the item purchased
- Input the tender given
- Voila, you're done!


### Lessons Learned
One of the biggest challenges faced with this program is getting past Java's own intricacies of how it handles operations with doubles. In order to properly do an operation with a double, we have to understand what computers do during floating point arithmetic, as opposed to whole numbers. 
Java has no issue with doing math concerning integers and presenting their solutions, because of the relative size in bits. Generally speaking, most day-to-day operations can be performed and return a value within the range of values an int can store. However, with decimal values, that range jumps significantly. In most programming languages, like Java, decimals are represented similarly to scientific notation. Instead of base 10 however, base 2 is used instead. Because their exponent cannot be a decimal, an integer must represent the value, which can cause rounding errors and issues for us when we need to have something as precise as giving exact change after a transaction.
One way to avoid this altogether is to simply multiply the decimal portion by 100 and casting it back to an int. This would prevent any further rounding error from occurring.

One of the interesting things about the assignment is getting the grammar of the output right. Most of the code could be consolidated with the use of an array containing the values of the cash types and iterating through each with a loop. Since these solutions were not part of the assignment, taking time to make sure the output was correct for each block was of the utmost importance.
