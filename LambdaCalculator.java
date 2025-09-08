// 1. Create a functional interface
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class LambdaCalculator {

    public static void main(String[] args) {
        // Define two numbers for the operations
        int num1 = 10;
        int num2 = 5;

        // 2. Use lambda expressions to implement the interface
        
        // Lambda for addition
        Calculator addition = (a, b) -> a + b;
        
        // Lambda for subtraction
        Calculator subtraction = (a, b) -> a - b;
        
        // Lambda for multiplication
        Calculator multiplication = (a, b) -> a * b;
        
        // Lambda for division
        Calculator division = (a, b) -> a / b;

        // 4. Call the operate method and print the results
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication.operate(num1, num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division.operate(num1, num2));
    }
}