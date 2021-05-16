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
One of the biggest challenges faced with this program is getting past Java's own intricacies with how it handles operations with doubles. In order to properly do an operation with a double, as opposed to an int, Java must convert the number into binary to represent it. While doing so, data is lost or added to make up for the conversion. Instead of having the double .01 represented as a literal, the conversion changes .01 into .0099999999997 or something similar to that effect. This causes issues for us when we need to have something as precise as giving exact change after a transaction.
One way to avoid this, is to simply add a .001 value to the double following its conversion. The amount wouldn't be evident in the calculation in change, and it would prevent the double from being rounded down. Another way is to multiply the decimal amount by 100 and continue the operation as an int. This would prevent the rounding error from occurring altogether as well.
