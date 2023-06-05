# Solution2

Solution2 is a Java program that evaluates mathematical expressions using an external API. It takes input expressions from the console and uses the math.js API to perform the evaluation. The evaluated results are then displayed on the console.

## Getting Started

To run the program, you need to have Java installed on your machine. Follow these steps:

1. Clone the repository or download the source code files.

2. Open a terminal or command prompt and navigate to the directory where the `solution2.java` file is located.

3. Compile the Java file using the `javac` command:

   # javac solution2.java

4. Run the compiled program using the java command:

# java solution2

The program will prompt you to enter mathematical expressions. Enter expressions one by one, and type "end" to stop the program.

The program will evaluate each expression using the math.js API and display the results on the console.

Usage
The program reads input expressions from the console and evaluates them using the math.js API. Here's an example usage:

// Example usage of Solution2 program

// Evaluate expressions
evaluateExpressions();
During runtime, the program will prompt you to enter mathematical expressions. For each expression, it will call the evaluateExpression method, which encodes the expression, sends an HTTP GET request to the math.js API, and retrieves the evaluated result. The result is then displayed on the console.
