# Java Beginer's Course - MECO Robotics

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Course Instructions

*Work in progress*

### Module 1 Exercises

- [ ] Change the `System.out.println` statement in App.java to print out "GO FOR MECO"
- [ ] Add more lines of code to print out: "What's 8 times 3?",  "24!", "83", "24"

### Module 2 Exercises

- [ ] Replace all the `System.out.println` lines in App.java with a series of lines of code that
    * Asks the user to enter any number
    * Assign the input to an integer variable, then print the number variable
    * Ask the user to enter another number
    * Assign the input to a floating point number variable, then print the number variable
    * Ask the user to enter a single character
    * Assign the input to a character variable, then print the character variable


#### HINT
 * `int i = scanner.nextInt();` - gets a number from the console and sets to an int variable 'i'
 * `float f = scanner.nextInt();` - gets a number from the console and sets to a float variable 'f'
 * `String s = scanner.next();` - gets a string from the console and sets to a String variable 's'



- [ ] Run the program with these inputs and observe the results with each run
    * 83,     24,     M
    * 83.24,  24,     M
    * 83,     83.24,  M
    * 83,     83.24,  MECO

### Module 3 Exercises

- [ ] Write a program that computes the position an infinite recharge ball travels:
    * Ask the user the x value 
    * Enter the x value into this quadratic:  y=-0.16x^2 + 3.6x + 1.2. This is a quadratic equation in standard form where:
      * a = -0.16
      * b = 3.6
      * c = 1.2
    * Print out the y value for the provided inputs.

- [ ] Find the total distance traveled by the ball.
    * Find the roots of the quadratic in the previous exercise using the quadratic formula.
    * The positive root represents the distance traveled. Print it out with a label.

### Module 4 Exercises

- [ ] Write a program that allows the user to determine if a 4 digit number has the first 2 digits multiplied to equal the last two
    * Ask the user to enter a 4 digit number - be sure to produce an error if their answer isn't 4 digits.
    * Break the string up into 3 strings - the first digit, second digit, and last two digits
    * Convert each of the strings into integers 
    * Check to see if the multiplication works
    * Print an answer

### Module 5 Exercises

### Module 6 Exercises

### Module 7 Exercises

### Module 8 Exercises

### Module 9 Exercises


Console color constants class:
https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println/45444716#45444716
